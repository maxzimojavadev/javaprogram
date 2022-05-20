package amazon.shopping.online;

public class Cart {
	
	Product product;
	
	public void addToCart(Product prod) {
		product= prod;
		System.out.println("Your selected product = "+product+" is successfully added to the cart");
	}

	@Override
	public String toString() {
		return "Cart [product=" + product + "]";
	}
	
	
	
}
