
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

class FishPlate extends Purchasable {	
	public FishPlate() {
		setUp("Fish Plate", 10d, true, false, "");
	}
}

class LobsterPlate extends Purchasable {
	public LobsterPlate() {
		setUp("Lobster Plate", 15d, true, false, "");
	}
}