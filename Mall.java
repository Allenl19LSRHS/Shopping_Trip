import java.util.ArrayList;

public abstract class Mall {
	public abstract Location getLocation(String s);
}

class FancyMall extends Mall {
	ArrayList<Location> locations = new ArrayList<Location>();
	Shopper player;
	
	public FancyMall(Shopper p) {
		// Add all the areas to the list here
		player = p;
		Location entrance = new Entrance(player);
		Location northWing = new NorthWing(player);
		Location legalSeaFoods = new LegalSeaFoods(player);
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