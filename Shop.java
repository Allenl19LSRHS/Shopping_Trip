import java.util.ArrayList;

public abstract class Shop extends Location {

}

class LegalSeaFoods extends Shop {
	String description = "";
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	
	public LegalSeaFoods() {
		setName("Legal Sea Foods");
		// Add products to list
		products.add(new FishPlate());
	}
	
	public void doConnections() {
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Entrance"));
	}
}