import java.util.ArrayList;

public abstract class Shop extends Location {

}

class LegalSeaFoods extends Shop {
	String description = "";
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	
	public LegalSeaFoods() {
		setName("Legal Sea Foods");
		createConnectedLocations();
		// Add products to list
		products.add(new FishPlate());
	}
	
	public void doConnections() {
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Entrance"));
	}
}