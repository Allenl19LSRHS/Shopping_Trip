import java.util.ArrayList;
import menu.*;

public class Shopper {
	String name;
	double balance;
	ArrayList<Purchasable> cart = new ArrayList<Purchasable>();
	ArrayList<Receipt> pocket = new ArrayList<Receipt>();
	Location currentLocation;
	LSMenu locationMenu = new LSMenu("Connected Locations:");
	Mall mall;
	
	public Shopper(String n, double b) {
		name = n;
		balance = b;
	}
	
	public void visit(Location l) {
		printInfo(currentLocation);
		if (!ShoppingTrip.isFinished) { 
			// List all the connected locations, and if it's a store, give an option for purchase
			ArrayList<Location> connectedLocations = l.getConnected();
			for (Location i : connectedLocations) {
				locationMenu.addItem(i.getName());
			}
			Location chosenLocation = connectedLocations.get(locationMenu.displayAndChoose() - 1);
			locationMenu.resetMenu();
			currentLocation = chosenLocation;
			visit(chosenLocation);
		}
	}
	
	public void visit (Mall m) {
		mall = m;
		currentLocation = mall.getLocation("Entrance");
		// Initiate doing things in the Entrance (visit the Entrance)
		visit(currentLocation);
	}
	
	public void printInfo(Location l) {
		System.out.println(l.description);
		LSMenu menu = new LSMenu("What do you want to do?");
		menu.addItem("Go to another location");
		menu.addItem("View your cart");
		menu.addItem("Check your receipts");
		menu.addItem("Leave the Mall");
		if (currentLocation instanceof Shop) {
			menu.addItem("Purchase something");
		}
		int answer = menu.displayAndChoose();
		
		switch (answer) {
			case 4:
				ShoppingTrip.setDone();
				break;
			case 1:
				menu = null;
				return;
			case 2:
				menu = null;
				printCart();
				printInfo(currentLocation);
				break;
			case 3:
				menu = null;
				printReceipts();
				printInfo(currentLocation);
				break;
			case 5:
				menu = null;
				((Shop)currentLocation).purchaseMenu();
				printInfo(currentLocation);
				break;
		}
	}
	
	void moveTo(Location l) {
		currentLocation = l;
	}
	
	public void printCart() {
		String totalCart = "Your cart is now: ";
		for (Purchasable i : cart) {
			totalCart += i.name + ", ";
		}
		System.out.println(totalCart);
	}
	
	public void printReceipts() {
		String totalReceipts = "Your pocket now has: \n";
		for (Receipt i : pocket) {
			totalReceipts += "Receipt for " + i.product.name + " from " + i.purchaseLocation.getName() + ", $" + i.price + "\n";
		}
		System.out.println(totalReceipts);
	}
	
	public void buy(Purchasable p) {
		if (!p.consumable) {
			cart.add(p);
		}
		balance -= p.price;
		pocket.add(new Receipt(p, p.price, currentLocation));
		System.out.println(p.description);
		printCart();
		System.out.println("Your card balance is now " + balance);
	}
}
