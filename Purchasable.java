
public abstract class Purchasable {
	
}

class FishPlate extends Purchasable {
	String name = "Fish Plate";
	double price = 10d;
	boolean consumable = true;
	boolean refundable = false;
	String description = "";
}

class LobsterPlate extends Purchasable {
	String name = "Lobster Plate";
	double price = 15d;
	boolean consumable = true;
	boolean refundable = false;
	String description = "";
}