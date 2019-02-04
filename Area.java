import java.util.ArrayList;

public abstract class Area extends Location {

}

class Entrance extends Area {
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	String description = "";
	
	public Entrance() {
		setName("Entrance");
	}
	
	public void doConnections() {
		//Add all the connected locations to the list in the constructor
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Legal Sea Foods"));
		connectedLocations.add(ShoppingTrip.getMall().getLocation("North Wing (Lower Level)"));
	}
}

class NorthWing extends Area {
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	public NorthWing() {
		setName("North Wing (Lower Level)");
	}
	String description = "";
	
	public void doConnections() {
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Entrance"));
	}
}