import java.util.ArrayList;

public abstract class Mall {
	public abstract Location getLocation(String s);
}
// having an abstract class allows multiple malls to be configured

class FancyMall extends Mall {
	// Arraylist of all the locations contained within the mall
	ArrayList<Location> locations = new ArrayList<Location>();
	// Each of the shops needs the player class, so the mall is passed it when created
	// and then gives it to each shop when creating the shops
	Shopper player;
	
	public FancyMall(Shopper p) {
		player = p;
		
		// Create all the locations. Need to access each twice, so store it to a variable
		Location entrance = new Entrance();
		Location northWing = new NorthWing();
		Location foodCourt = new FoodCourt();
		Location legalSeaFoods = new LegalSeaFoods(player);
		Location dunkin = new Dunkin(player);
		Location bestBuy = new BestBuy(player);
		Location tacoBell = new TacoBell(player);
		
		// add all the locations to the arraylist for easy access
		locations.add(entrance);
		locations.add(northWing);
		locations.add(foodCourt);
		locations.add(legalSeaFoods);
		locations.add(dunkin);
		locations.add(bestBuy);
		locations.add(tacoBell);
		
		// Set up connections between them (telling each of them which locations are connected to it)
		entrance.doConnections(northWing, foodCourt, legalSeaFoods, dunkin);
		northWing.doConnections(entrance, foodCourt, bestBuy);
		foodCourt.doConnections(entrance, northWing, tacoBell);
		legalSeaFoods.doConnections(entrance);
		dunkin.doConnections(entrance);
		bestBuy.doConnections(northWing);
		tacoBell.doConnections(foodCourt);
	}

	
	// getter for searching and returning a location based on its name, only currently used
	// by the shopper in the beginning to put player in the entrance
	public Location getLocation(String s) {
		for (Location i : locations) {
			if (i.getName().equals(s)) {
				return i;
			}
		}
		return null;
	}
}