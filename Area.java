public abstract class Area extends Location {

}


// Areas are the places that aren't shops/stores but still have connections
// As such, they don't need to know much of anything, they just exist
// All methods are simply inherited from Location
class Entrance extends Area {
	
	public Entrance() {
		setName("Entrance");
		setDescription("You are in the main entrance area.");
		createConnectedLocations();
	}
}

class NorthWing extends Area {
	
	public NorthWing() {
		setName("North Wing");
		setDescription("You are in the North Wing, with several retail stores.");
		createConnectedLocations();
	}
}