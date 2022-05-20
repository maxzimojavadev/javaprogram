package amazon.shopping.online;

public class OrderDetails {
	
	Product product;
	
	public void displayOrderDetails(Product product){
			//String prodType, String prodName, int prodCost, int qty
		System.out.println("Your Product = "+product.productName+" order details");
		System.out.println("----------------------------------------------------");
		System.out.println("Product Type : "+product.productType);
		System.out.println("Product Name : "+product.productName);
		System.out.println("Product Cost : "+product.productCost);
		System.out.println("Quantity : "+product.quantity);
		
	}

}
