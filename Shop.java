import java.util.ArrayList;

public abstract class Shop extends Location {

}

class LegalSeaFoods extends Shop {
	String name = "Legal Sea Foods";
	String description = "";
	ArrayList<Purchasable> products = new ArrayList<Purchasable>();
	
	public LegalSeaFoods() {
		// Add products to list
	}
	
	public String getName() {
		return name;
	}
}