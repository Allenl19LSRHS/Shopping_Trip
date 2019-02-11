
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
class smallCoffee extends Purchasable {
	public smallCoffee() {
		setUp("Small Coffee", 1.59d, true, false, "");
	}
}

class mediumCoffee extends Purchasable {
	public mediumCoffee() {
		setUp("Medium Coffee", 1.89d, true, false, "");
	}
}

class largeCoffee extends Purchasable {
	public largeCoffee() {
		setUp("Large Coffee", 2.09d, true, false, "");
	}
}