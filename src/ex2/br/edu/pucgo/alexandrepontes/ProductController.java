package ex2.br.edu.pucgo.alexandrepontes;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

	public List<Product> returnListOfProducts() {

		List<Product> products = new ArrayList<>();

		products.add(new Product(1, "Escova dental", "Higiene", 5.99));
		products.add(new Product(2, "Preservativo", "Higiene", 3.50));
		products.add(new Product(3, "Xampu", "Higiene", 7.45));
		products.add(new Product(4, "Papel Higiênico", "Higiene", 9.50));
		products.add(new Product(5, "Pasta dental", "Higiene", 4.87));
		
		
		return products;
	}
	
	public Product returnProduct(Integer id) {
		List<Product> products = new ArrayList<>();
		Product p = null;
		products.add(new Product(1, "Escova dental", "Higiene", 5.99));
		products.add(new Product(2, "Preservativo", "Higiene", 3.50));
		products.add(new Product(3, "Xampu", "Higiene", 7.45));
		products.add(new Product(4, "Papel Higiênico", "Higiene", 9.50));
		products.add(new Product(5, "Pasta dental", "Higiene", 4.87));
		
		for (Product product : products) {
			if(product.getId().equals(id)) {
				p = new Product(product.getId(), product.getName(), product.getProductCategory(), product.getPrice());
			}
		}
		
		return p;
	}


}
