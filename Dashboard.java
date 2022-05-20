package amazon.shopping.online;

public class Dashboard {
	
	String mobiles;
	String electronics;
	String books;
	String clothings;
		
	public void displayProductsOnScreen() {
		System.out.println("|-------|-----------------------------|-------|---------|");
		System.out.println("|Mobile |  Electronincs --------------| Books | Clothing|");
		System.out.println("|-------|-----------------------------|-------|---------|");
		System.out.println("|Samsung|---Washing Machine-(LG)------|-WPME--|---------|");
		System.out.println("|RedMi  |-----------------------------|-------|---------|");
		System.out.println("|Vivo   |-----------------------------|-------|---------|");
		System.out.println("|IPhone |-----------------------------|-------|---------|");
	}

}
