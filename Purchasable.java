
public abstract class Purchasable {
	String name;
	double price;
	boolean consumable;
	boolean refundable;
	String description;
	
	public void setUp(String n, double p, boolean c, boolean r, String d) {
		name = n;
		price = p;
		consumable = c;
		refundable = r;
		description = d;
	}
}

// Purchasables are anything you can buy from a store
// They have several member variables, all common, and all set by a method inherited from the base class

// Legal Sea Foods
class SalmonPlate extends Purchasable {	
	public SalmonPlate() {
		setUp("Salmon Plate", 30d, true, false, "Delicious Salmon with a special seasoning...");
	}
}

class LobsterPlate extends Purchasable {
	public LobsterPlate() {
		setUp("Lobster Plate", 68d, true, false, "It was expensive, but a whole lobster is delicious...");
	}
}

class FishCakes extends Purchasable {
	public FishCakes() {
		setUp("Fish Cakes", 20d, true, false, "mmmm... several fish cakes covered with delicious bread crumbs");
	}
}

// Dunkin
class SmallCoffee extends Purchasable {
	public SmallCoffee() {
		setUp("Small Coffee", 1.59d, true, false, "Small, hot coffee, just enough for a light pick-me-up");
	}
}

class MediumCoffee extends Purchasable {
	public MediumCoffee() {
		setUp("Medium Coffee", 1.89d, true, false, "Warm, soothing medium coffee, and you feel a little less tired now");
	}
}

class LargeCoffee extends Purchasable {
	public LargeCoffee() {
		setUp("Large Coffee", 2.09d, true, false, "Man, that was a lot of coffee. You won't be tired all day");
	}
}

class BreakfastSandwich extends Purchasable {
	public BreakfastSandwich() {
		setUp("Breakfast Sandwich", 3.59d, true, false, "Pretty good toasted bagel with sausage, egg, and cheese");
	}
}

// Best Buy
class VRHeadset extends Purchasable {
	public VRHeadset() {
		setUp("Virtual Realist Headset", 399.99d, false, true, "This is it! A new Oculus Rift VR headset, you can't wait to go home and try");
	}
}

class Printer extends Purchasable {
	public Printer() {
		setUp("Fancy Home Printer", 99.99d, false, true, "A pretty nice printer with some extra features");
	}
}

class CheapPrinter extends Purchasable {
	public CheapPrinter() {
		setUp("Cheap Home Printer", 49.99d, false, true, "Your average basic, cheap printer that will probably run out of ink a lot");
	}
}

class Laptop extends Purchasable {
	public Laptop() {
		setUp("Laptop Computer", 400d, false, true, "Hey look, an Alienware");
	}
}

class TV extends Purchasable {
	public TV() {
		setUp("Standard 50in TV", 200d, false, true, "You mean this TV can't even do Netflix?");
	}
}

class SmartTV extends Purchasable {
	public SmartTV() {
		setUp("50 inch 4k Smart TV", 330d, false, true, "You mean this can do Netflix AND Hulu?");
	}
}

// Taco Bell
class Taco extends Purchasable {
	public Taco() {
		setUp("Single Hard-shell Taco", 1.19d, true, false, "Who even eats just one taco");
	}
}

class TacoCombo extends Purchasable {
	public TacoCombo() {
		setUp("Taco Combo: 3 Hard-shell Tacos and a Drink", 5.59d, true, false, "More tacos!");
	}
}

class Burrito extends Purchasable {
	public Burrito() {
		setUp("Burrito", 1.99d, true, false, "Too many beans");
	}
}

// Panera
class Salad extends Purchasable {
	public Salad() {
		setUp("Salad", 5.79d, true, false, "Being healthy I see");
	}
}

class TurkeySandwich extends Purchasable {
	public TurkeySandwich() {
		setUp("Turkey Sandwich", 10.38d, true, false, "It's not thanksgiving, but hey, it's good");
	}
}

class GrilledCheese extends Purchasable {
	public GrilledCheese() {
		setUp("Grilled Cheese Sandwich", 8.61d, true, false, "Your inner 5-year-old comes out a little");
	}
}

class MacnCheese extends Purchasable {
	public MacnCheese() {
		setUp("Mac n' Cheese", 5.19d, true, false, "Just like mom didn't used to make it");
	}
}