package amazon.shopping.online;

public class Manager {

	public static void main(String[] args) {
	
		System.out.println("===================================================");
		
		Dashboard db = new Dashboard();
		db.displayProductsOnScreen();
		
		Cart anilCart = new Cart();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% \n\n");
		
		//Product-1
		Product product1 = new Product();
		product1.selectedProduct("Mobile", "Samsung-MMx567", 12000, 2);
		anilCart.addToCart(product1);
		
		//Product-2
		Product product2 = new Product();
		product2.selectedProduct("Books", "WordPowerMadeEasy", 299, 1);
		anilCart.addToCart(product2);
		
		//Product-3
		Product product3 = new Product();
		product3.selectedProduct("Electronics", "Washing Machine LG", 15000, 1);
		anilCart.addToCart(product3);
		
		//OrderDetails anilOrderDetails = new OrderDetails();
		//anilOrderDetails.displayOrderDetails(samsungMobile);
		System.out.println("===================================================");
	}

}
