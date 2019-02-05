
public class ShoppingTrip {
	
	public static void main(String[] args) {
		Mall mall = new BurlingtonMall();
		Shopper player = new Shopper("Lucas", 1000);
		
		player.visit(mall);
	}
}
