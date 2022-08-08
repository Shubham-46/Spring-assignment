package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private List<Product> prod=new ArrayList<>(Arrays.asList(
			new Product(101, "IphoneSix", 10000, "Apple", "Mobile", 1010, 20001),
			new Product(102, "IphoneSeven", 11000, "Apple", "Mobile", 1011, 20002),
			new Product(103, "IphoneEight", 12000, "Apple", "Mobile", 1011, 20003)
			
			));
	
	public List<Product> getAllProduct(){
		return prod;
	}
	
	public Product getProduct(Integer id) {
		return prod.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addProduct(Product product) {
		prod.add(product);
	}
	
	public void updateProduct(Integer id,Product product) {
		for(int i=0;i<prod.size();i++) {
			Product p=prod.get(i);
			if(p.getId().equals(id)) {
				prod.set(i, p);
				return;
			}
		}
	}

	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		prod.removeIf(t -> t.getId().equals(id));
	}
}
