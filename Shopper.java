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
		currentLocation.printInfo();
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
	
	void moveTo(Location l) {
		currentLocation = l;
	}
}
