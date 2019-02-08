import menu.*;


public abstract class Area extends Location {

}

class Entrance extends Area {
	String description = "Placeholder Description";
	Shopper player;
	
	public Entrance(Shopper p) {
		setName("Entrance");
		createConnectedLocations();
		player = p;
	}
	
	public void printInfo() {
		System.out.println(description);
		LSMenu menu = new LSMenu("What do you want to do?");
		menu.addItem("Go to another location");
		menu.addItem("Leave the Mall");
		int answer = menu.displayAndChoose();
		
		switch (answer) {
			case 2:
				ShoppingTrip.setDone();
				break;
			case 1:
				menu = null;
				return;
		}
	}
}

class NorthWing extends Area {
	String description = "You are in the North Wing, with several retail stores arrayed along.";
	Shopper player;
	
	public NorthWing(Shopper p) {
		setName("North Wing");
		createConnectedLocations();
		player = p;
	}
	
	public void printInfo() {
		System.out.println(description);
	}
}