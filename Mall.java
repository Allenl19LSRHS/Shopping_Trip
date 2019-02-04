import java.util.ArrayList;

public abstract class Mall {
	public abstract Location getLocation(String s);
	
	public abstract void setUpConnections();
}

class BurlingtonMall extends Mall {
	static ArrayList<Location> locations = new ArrayList<Location>();
	
	public BurlingtonMall() {
		// Add all the areas to the list here
		locations.add(new Entrance());
		locations.add(new NorthWing());
		locations.add(new LegalSeaFoods());
	}
	
	public void setUpConnections() {
		for (Location i:locations) {
			i.doConnections();
		}
	}
	
	public Location getLocation(String s) {
		for (Location i : locations) {
			if (i.getName().equals(s)) {
				return i;
			}
		}
		return null;
	}
}