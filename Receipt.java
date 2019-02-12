

// Receipts are simple objects added to player's pockets after every purchase, serves as transaction history
public class Receipt {
	Purchasable product;
	double price;
	Location purchaseLocation;
	
	public Receipt(Purchasable p, double d, Location l) {
		product = p;
		price = d;
		purchaseLocation = l;
	}
}
