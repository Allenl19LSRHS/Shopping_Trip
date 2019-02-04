
public class ShoppingTrip {
	static Mall mall;
	
	public static void main(String[] args) {
		boolean running = true;
		mall = new BurlingtonMall();
		mall.setUpConnections();
		Shopper player = new Shopper("Lucas", 1000);
		
		do {
			
		} while (running);
	}
	
	public static Mall getMall() {
		return mall;
	}
}
