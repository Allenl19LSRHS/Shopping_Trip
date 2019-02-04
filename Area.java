public abstract class Area extends Location {

}

class Entrance extends Area {
	String description = "";
	
	public Entrance() {
		setName("Entrance");
		createConnectedLocations();
	}
	
	public void doConnections() {
		//Add all the connected locations to the list in the constructor
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Legal Sea Foods"));
		connectedLocations.add(ShoppingTrip.getMall().getLocation("North Wing (Lower Level)"));
	}
}

class NorthWing extends Area {
	public NorthWing() {
		setName("North Wing (Lower Level)");
		createConnectedLocations();
	}
	String description = "";
	
	public void doConnections() {
		connectedLocations.add(ShoppingTrip.getMall().getLocation("Entrance"));
	}
}