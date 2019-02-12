
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

// Legal Sea Foods
class SalmonPlate extends Purchasable {	
	public SalmonPlate() {
		setUp("Salmon Plate", 30d, true, false, "");
	}
}

class LobsterPlate extends Purchasable {
	public LobsterPlate() {
		setUp("Lobster Plate", 68d, true, false, "");
	}
}

class FishCakes extends Purchasable {
	public FishCakes() {
		setUp("Fish Cakes", 20d, true, false, "");
	}
}

// Dunkin
class SmallCoffee extends Purchasable {
	public SmallCoffee() {
		setUp("Small Coffee", 1.59d, true, false, "");
	}
}

class MediumCoffee extends Purchasable {
	public MediumCoffee() {
		setUp("Medium Coffee", 1.89d, true, false, "");
	}
}

class LargeCoffee extends Purchasable {
	public LargeCoffee() {
		setUp("Large Coffee", 2.09d, true, false, "");
	}
}

class BreakfastSandwich extends Purchasable {
	public BreakfastSandwich() {
		setUp("Breakfast Sandwich", 3.59d, true, false, "");
	}
}

// Best Buy
class VRHeadset extends Purchasable {
	public VRHeadset() {
		setUp("Virtual Realist Headset", 399.99d, false, true, "");
	}
}

class Printer extends Purchasable {
	public Printer() {
		setUp("Fancy Home Printer", 99.99d, false, true, "");
	}
}

class CheapPrinter extends Purchasable {
	public CheapPrinter() {
		setUp("Cheap Home Printer", 49.99d, false, true, "");
	}
}