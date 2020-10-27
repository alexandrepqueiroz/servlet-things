package ex2.br.edu.pucgo.alexandrepontes;

public class Product {

	private Integer id;
	
	private String name;
	
	private String productCategory;
	
	private Double price;
	

	public Product() {}

	public Product(Integer id, String name, String productCategory, Double price) {
		this.id = id;
		this.name = name;
		this.productCategory = productCategory;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
