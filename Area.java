public abstract class Area extends Location {

}

class Entrance extends Area {
	Shopper player;
	
	public Entrance(Shopper p) {
		setName("Entrance");
		setDescription("You are in the main entrance area.");
		createConnectedLocations();
		player = p;
	}
}

class NorthWing extends Area {
	Shopper player;
	
	public NorthWing(Shopper p) {
		setName("North Wing");
		setDescription("You are in the North Wing, with several retail stores.");
		createConnectedLocations();
		player = p;
	}
}