
public class ShoppingTrip {
	static boolean isFinished = false;
	
	public static void main(String[] args) {
		Mall mall = new FancyMall();
		Shopper player = new Shopper("Lucas", 1000);
		
		player.visit(mall);
	}
	
	public static void setDone() {
		isFinished = true;
	}
}
