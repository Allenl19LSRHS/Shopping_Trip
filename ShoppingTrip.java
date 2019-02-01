import java.util.ArrayList;

public class ShoppingTrip {
	static Mall mall;
	
	public static void main(String[] args) {
		Shopper player = new Shopper("Lucas", 1000);
	}
	
	public ShoppingTrip() {
		mall = new BurlingtonMall();
	}
	
	public static Mall getMall() {
		return mall;
	}
}
