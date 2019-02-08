import java.util.ArrayList;
import java.util.Arrays;

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
