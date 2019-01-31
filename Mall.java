import java.util.ArrayList;

public abstract class Mall {

}

class BurlingtonMall extends Mall {
	ArrayList<Location> locations = new ArrayList<Location>();
	
	public BurlingtonMall() {
		// Add all the areas to the list here
		locations.add(new Entrance());
		locations.add(new NorthWing());
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