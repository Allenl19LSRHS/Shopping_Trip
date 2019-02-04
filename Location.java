import java.util.ArrayList;

public abstract class Location {
	ArrayList<Location> connectedLocations;
	String name = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public ArrayList<Location> getConnected() {
		return connectedLocations;
	}
	
	public abstract void doConnections();
}
