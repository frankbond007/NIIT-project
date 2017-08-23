package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ProductDao;
import model.Product;

@Controller
public class homeController {
	
	private ProductDao productDao=new ProductDao();
@RequestMapping("/index")
public String home()
{
	return ("index");
}
@RequestMapping("/productList")
public String getProducts(Model model){
	List<Product> productList = productDao.getProductList();
	Product product = productList.get(0);
	model.addAttribute(product);
	
	return "productList";
	
	
	
}
}
