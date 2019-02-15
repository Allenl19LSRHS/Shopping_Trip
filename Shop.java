import java.util.ArrayList;
import java.util.Arrays;
import menu.*;

// The base shop has more specialized functionality that Locations and Areas don't have
// 	method to set products list
// 	method that gets the player object (for purchasing things)
// 	the actual purchaseMenu method that displays options for purchase
public abstract class Shop extends Location {
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	Shopper player;
	
	void getPlayer(Shopper p) {
		player = p;
	}
	
	public void setProducts(Purchasable...pros) {
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

// Making a shop needs:
// 	a setName
//	createConnectedLocations
//	a setDescription
//	a getPlayer(p)
//	a setProducts

class LegalSeaFoods extends Shop {
	
	// Don't forget the Shopper p part!
	public LegalSeaFoods(Shopper p) {
		// sets the name of the location (Inherited class and variable from Location)
		setName("Legal Sea Foods");
		// inherited method from Location which sets up connections
		createConnectedLocations();
		// Inherited method from location which sets the description variable, also inherited
		setDescription("This is Legal Sea Foods, a popular and large sea fod restaurant");
		// inherited method from Shop that gives the store the player object
		getPlayer(p);
		// Add products to list, inherited method from Shop
		setProducts(new SalmonPlate(), new LobsterPlate(), new FishCakes());
	}
}

class Dunkin extends Shop {
	
	public Dunkin(Shopper p) {
		setName("Dunkin Donuts");
		createConnectedLocations();
		setDescription("Dunkin Donuts, a huge coffee and donut chain");
		getPlayer(p);
		setProducts(new SmallCoffee(), new MediumCoffee(), new LargeCoffee(), new BreakfastSandwich());
	}
}

class BestBuy extends Shop {
	
	public BestBuy(Shopper p) {
		setName("Best Buy");
		createConnectedLocations();
		setDescription("Best Buy, a large mostly technology superstore");
		getPlayer(p);
		setProducts(new VRHeadset(), new Printer(), new CheapPrinter(), new Laptop(), new TV(), new SmartTV());
	}
}

class TacoBell extends Shop {
	public TacoBell(Shopper p) {
		setName("Taco Bell");
		createConnectedLocations();
		setDescription("Taco Bell, a fast food mexican restaurant");
		getPlayer(p);
		setProducts(new Taco(), new TacoCombo(), new Burrito());
	}
}

class Panera extends Shop {
	public Panera(Shopper p) {
		setName("Panera Bread");
		createConnectedLocations();
		setDescription("Panera Bread, a soup and sandwich place");
		getPlayer(p);
		setProducts(new Salad(), new TurkeySandwich(), new GrilledCheese(), new MacnCheese());
	}
}