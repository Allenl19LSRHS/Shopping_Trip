import java.util.ArrayList;
import java.util.Arrays;
import menu.*;

public abstract class Shop extends Location {
	ArrayList<Purchasable> products;
	Shopper player;
	
	void getPlayer(Shopper p) {
		player = p;
	}
	
	void setProducts(Purchasable...pros) {
		products.addAll(Arrays.asList(pros));
	}
	
	public void purchaseMenu() {
		LSMenu menu = new LSMenu("Welcome to " + getName() + ". What can I get for you today?");
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

class LegalSeaFoods extends Shop {
	
	public LegalSeaFoods(Shopper p) {
		setName("Legal Sea Foods");
		createConnectedLocations();
		setDescription("This is Legal Sea Foods, a popular and large sea fod restaurant");
		getPlayer(p);
		// Add products to list
		setProducts(new SalmonPlate(), new LobsterPlate(), new FishCakes());
	}
}

class Dunkin extends Shop {
	
	public Dunkin(Shopper p) {
		setName("Dunkin Donuts");
		createConnectedLocations();
		setDescription("Dunkin Donuts, a huge coffee and donut chain");
		getPlayer(p);
		setProducts(new smallCoffee(), new mediumCoffee(), new largeCoffee(), new breakfastSandwich());
	}
}

class BestBuy extends Shop {
	
	public BestBuy(Shopper p) {
		setName("Best Buy");
		createConnectedLocations();
		setDescription("Best Buy, a large mostly technology superstore");
		getPlayer(p);
		setProducts();
	}
}