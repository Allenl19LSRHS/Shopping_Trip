import java.util.ArrayList;

public abstract class Mall {
	public abstract Location getLocation(String s);
}

class BurlingtonMall extends Mall {
	static ArrayList<Location> locations = new ArrayList<Location>();
	
	public BurlingtonMall() {
		// Add all the areas to the list here
		Location entrance = new Entrance();
		Location northWing = new NorthWing();
		Location legalSeaFoods = new LegalSeaFoods();
		locations.add(entrance);
		locations.add(northWing);
		locations.add(legalSeaFoods);
		
		// Set up connections
		entrance.doConnections(northWing, legalSeaFoods);
		northWing.doConnections(entrance);
		legalSeaFoods.doConnections(entrance);
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