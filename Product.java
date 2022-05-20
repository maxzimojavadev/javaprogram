package amazon.shopping.online;

public class Product {
	
	@Override
	public String toString() {
		return "Product [productType=" + productType + ", productName=" + productName + ", productCost=" + productCost
				+ ", quantity=" + quantity + "]";
	}

	String productType;
	String productName;
	int productCost;
	int quantity;
	
	public void selectedProduct(String prodType, String prodName, int prodCost, int qty) {
		
		 productType=prodType;
		 productName=prodName;
		 productCost=prodCost;
		 quantity=qty;
	}

}
