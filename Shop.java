import java.util.ArrayList;
import menu.*;

public abstract class Shop extends Location {

}

class LegalSeaFoods extends Shop {
	String description = "Placeholder";
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	Shopper player;
	
	public LegalSeaFoods(Shopper p) {
		setName("Legal Sea Foods");
		createConnectedLocations();
		player = p;
		// Add products to list
		products.add(new FishPlate());
		products.add(new LobsterPlate());
	}
	
	public void printInfo() {
		System.out.println(description);
		
		LSMenu menu = new LSMenu("What would you like to do?");
		menu.addItem("Buy a product");
		menu.addItem("Go to another area");
		
		switch (menu.displayAndChoose()) {
			case 1:
				menu = null;
				purchaseMenu();
				break;
			case 2:
				menu = null;
				return;
		}
	}
	
	void purchaseMenu() {
		LSMenu menu = new LSMenu("Welcome to Legal Sea Foods. What can I get for you today?");
		for (Purchasable i : products) {
			menu.addItem(i.name);
		}
		menu.addItem("Never mind, thanks");
		int answer = menu.displayAndChoose();
		if (answer == products.size() + 1) {
			return;
		} else {
			Purchasable selProduct = products.get(answer-1);
			player.buy(selProduct);
		}
	}
}