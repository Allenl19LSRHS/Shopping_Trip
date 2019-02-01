import java.util.ArrayList;

public abstract class Shop extends Location {

}

class LegalSeaFoods extends Shop {
	String name = "Legal Sea Foods";
	String description = "";
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	
	public LegalSeaFoods() {
		// Add products to list
	}
	
	public void doConnections() {
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Entrance"));
	}
	
	public String getName() {
		return name;
	}
}