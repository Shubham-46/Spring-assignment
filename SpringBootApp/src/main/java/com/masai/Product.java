package com.masai;

public class Product {

	private Integer id;
	private String name;
	private Integer price;
	private String brand;
	private String category;
	private Integer registration_no;
	private Integer manfacturer_id;
	
	public Product(){
		
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(Integer registration_no) {
		this.registration_no = registration_no;
	}

	public Integer getManfacturer_id() {
		return manfacturer_id;
	}

	public void setManfacturer_id(Integer manfacturer_id) {
		this.manfacturer_id = manfacturer_id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
				+ category + ", registration_no=" + registration_no + ", manfacturer_id=" + manfacturer_id + "]";
	}

	public Product(Integer id, String name, Integer price, String brand, String category, Integer registration_no,
			Integer manfacturer_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.registration_no = registration_no;
		this.manfacturer_id = manfacturer_id;
	}
	
	public void deleteProduct(Integer id) {
		
	}
	
}
