import java.util.ArrayList;

public class Shopper {
	String name;
	double balance;
	ArrayList<Purchasable> cart = new ArrayList<Purchasable>();
	ArrayList<Receipt> pocket = new ArrayList<Receipt>();
	Location currentLocation;
	
	public Shopper(String n, double b) {
		name = n;
		balance = b;
		currentLocation = ShoppingTrip.getMall().getLocation("Entrance");
	}
}
