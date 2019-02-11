import java.util.ArrayList;
import menu.*;

public abstract class Shop extends Location {
	public abstract void purchaseMenu();
}

class LegalSeaFoods extends Shop {
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	Shopper player;
	
	public LegalSeaFoods(Shopper p) {
		setName("Legal Sea Foods");
		createConnectedLocations();
		setDescription("This is Legal Sea Foods, a popular and large sea fod restaurant");
		player = p;
		// Add products to list
		products.add(new SalmonPlate());
		products.add(new LobsterPlate());
		products.add(new FishCakes());
	}
	
	public void purchaseMenu() {
		LSMenu menu = new LSMenu("Welcome to Legal Sea Foods. What can I get for you today?");
		for (Purchasable i : products) {
			menu.addItem(i.name + ", $" + i.price);
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

class Dunkin extends Shop {
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	Shopper player;
	
	public Dunkin(Shopper p) {
		setName("Dunkin Donuts");
		createConnectedLocations();
		setDescription("Dunkin Donuts, a huge coffee and donut chain");
		player = p;
		
		products.add(new smallCoffee());
		products.add(new mediumCoffee());
		products.add(new largeCoffee());
	}
	
	public void purchaseMenu() {
		LSMenu menu = new LSMenu("Welcome to Dunkin Donuts. What can I get for you today?");
		for (Purchasable i : products) {
			menu.addItem(i.name + ", $" + i.price);
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