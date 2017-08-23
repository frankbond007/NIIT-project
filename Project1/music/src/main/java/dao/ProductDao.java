package dao;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDao {

	private List<Product> productList;
	public List<Product> getProductList(){

		Product product1=new Product();
		
		product1.setProductCategory("Instrument");
		product1.setProductCondition("new");
		product1.setProductDescription("Fender Strat Guitar");
		product1.setProductManufacturer("Fender");
		product1.setProductName("Guitar");
		product1.setProductPrice(1200);
		product1.setProductStatus("Available");
		product1.setUnitInStock(11);
		
		productList = new ArrayList<Product>();
		productList.add(product1);
		
		return productList;
		
	}
	
	

		
	
	
	
}
