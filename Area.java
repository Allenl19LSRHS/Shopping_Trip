import java.util.ArrayList;

public abstract class Area extends Location {

}

class Entrance extends Area {
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	String name = "Entrance";
	String description = "";
	
	
	public Entrance() {
		//Add all the connected locations to the list in the constructor
		connectedLocations.add(new LegalSeaFoods());
	}
	
	public String getName() {
		return name;
	}
}

class NorthWing extends Area {
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	String name = "North Wing (Lower Level)";
	String description = "";
	
	public NorthWing() {
		connectedLocations.add(BurlingtonMall.getLocation("Entrance"));
	}
	
	public String getName() {
		return name;
	}
}