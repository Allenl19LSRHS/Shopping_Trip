import java.util.ArrayList;
import java.util.Arrays;

// The base class for every place the player can go, including areas and shops
// provides base functionality, including connected locations, name, description, and getters/setters for all
public abstract class Location {
	ArrayList<Location> connectedLocations;
	String name = "";
	String description;
	
	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public void createConnectedLocations() {
		connectedLocations = new ArrayList<Location>();
	}
	
	public ArrayList<Location> getConnected() {
		return connectedLocations;
	}
	
	public void doConnections(Location...locations) {
		connectedLocations.addAll(Arrays.asList(locations));
	}
	
	public void setDescription(String s) {
		description = s;
	}
}
