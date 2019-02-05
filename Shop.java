import java.util.ArrayList;
import menu.*;

public abstract class Shop extends Location {

}

class LegalSeaFoods extends Shop {
	String description = "Placeholder";
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	
	public LegalSeaFoods() {
		setName("Legal Sea Foods");
		createConnectedLocations();
		// Add products to list
		products.add(new FishPlate());
	}
	
	public void printInfo() {
		System.out.println(description);
		
		LSMenu menu = new LSMenu("What would you like to do?");
		menu.addItem("Buy a product");
		menu.addItem("Go to another area");
		
		switch (menu.displayAndChoose()) {
			case 1:
				purchaseMenu();
				break;
			case 2:
				return;
		}
	}
	
	void purchaseMenu() {
		
	}
}