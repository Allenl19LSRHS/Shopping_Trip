
public class ShoppingTrip {
	static boolean isFinished = false;
	
	public static void main(String[] args) {
		Shopper player = new Shopper("Lucas", 1000);
		Mall mall = new FancyMall(player);
		
		player.visit(mall);
	}
	
	public static void setDone() {
		isFinished = true;
	}
}
