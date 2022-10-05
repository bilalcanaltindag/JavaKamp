package OOP1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bos1.jpg");
		
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bos2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bos3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product listOfProduct : products) {
			System.out.println("<li>" + listOfProduct.getName() + "</li>");
		}
		System.out.println("</ul>"); 
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05326555555");
		individualCustomer.setCustomerNumber("1123");
		individualCustomer.setFirstName("Bilal Can");
		individualCustomer.setLastName("Altındağ");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setCustomerNumber("123");
	}

}
