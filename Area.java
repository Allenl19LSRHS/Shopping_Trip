import menu.*;


public abstract class Area extends Location {

}

class Entrance extends Area {
	String description = "Placeholder Description";
	
	public Entrance() {
		setName("Entrance");
		createConnectedLocations();
	}
	
	public void printInfo() {
		System.out.println(description);
		LSMenu menu = new LSMenu("What do you want to do?");
		menu.addItem("Go to another location");
		menu.addItem("Leave the Mall");
		int answer = menu.displayAndChoose();
		
		switch (answer) {
			case 1:
				//ShoppingTrip.exit();
				break;
			case 2:
				menu = null;
				return;
		}
	}
}

class NorthWing extends Area {
	String description = "Placeholder Description";
	
	public NorthWing() {
		setName("North Wing (Lower Level)");
		createConnectedLocations();
	}
	
	public void printInfo() {
		System.out.println(description);
	}
}