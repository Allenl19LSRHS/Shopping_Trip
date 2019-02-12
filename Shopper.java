import java.util.ArrayList;
import menu.*;

public class Shopper {
	// A bunch of member data
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
	
	// Method that does most of the work, running the high level menu and then the movement options
	public void visit(Location l) {
		// Runs current location's program, including abilities to check cart and pocket, leave, etc
		printInfo(currentLocation);
		
		// Check if the option selected in the printInfo was to leave
		if (!ShoppingTrip.isFinished) {
			// List all the connected locations, and if it's a store, give an option for purchase
			ArrayList<Location> connectedLocations = l.getConnected();
			for (Location i : connectedLocations) {
				locationMenu.addItem(i.getName());
			}
			Location chosenLocation = connectedLocations.get(locationMenu.displayAndChoose() - 1);
			// Remove all options from the menu for the next running
			locationMenu.resetMenu();
			moveTo(chosenLocation);
			// run this method again in the new location
			visit(chosenLocation);
		}
	}
	
	// Initial visit method that gives the player what mall they're in
	public void visit (Mall m) {
		mall = m;
		currentLocation = mall.getLocation("Entrance");
		// Initiate doing things in the Entrance (visit the Entrance)
		visit(currentLocation);
	}
	
	// The high-level menu that's almost the same for every location
	public void printInfo(Location l) {
		// Get and print where the shopper is
		System.out.println(l.description);
		
		//Menu for doing stuff
		LSMenu menu = new LSMenu("What do you want to do?");
		menu.addItem("Go to another location");
		menu.addItem("View your cart");
		menu.addItem("Check your receipts");
		menu.addItem("Leave the Mall");
		if (currentLocation instanceof Shop) {
			menu.addItem("Purchase something");
		}
		int answer = menu.displayAndChoose();
		
		// Depending on the answer, close the program, do nothing and allow visit() to continue,
		// print the cart or pocket and run this method again, or run the purchase menu if l is a shop
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
	
	
	// moves the player to the new location
	void moveTo(Location l) {
		currentLocation = l;
	}
	
	// Prints the contents of the player's cart (what they have bought that they didn't consume)
	public void printCart() {
		String totalCart = "Your cart is now: ";
		for (Purchasable i : cart) {
			totalCart += i.name + ", ";
		}
		System.out.println(totalCart);
	}
	
	// Print the contents of the pocket (reciepts of all purchases made)
	public void printReceipts() {
		String totalReceipts = "Your pocket now has: \n";
		for (Receipt i : pocket) {
			totalReceipts += "Receipt for " + i.product.name + " from " + i.purchaseLocation.getName() + ", $" + i.price + "\n";
		}
		System.out.println(totalReceipts);
	}
	
	// method to actually buy products, called by the shops in purchaseMenu()
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
