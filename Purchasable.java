
public abstract class Purchasable {
	
}

class FishPlate extends Purchasable {
	String name = "Fish Plate";
	double price = 10d;
	boolean consumable = true;
	boolean refundable = false;
	String description = "";
	
	public FishPlate() {
		
	}
}