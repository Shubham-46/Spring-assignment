package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@Autowired
	private ProductService productService;
	
	//View AllProduct
	@RequestMapping("/product")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	//Get Method 
	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) {
		return productService.getProduct(id);
	}
	
	//Post Method
	@RequestMapping(method=RequestMethod.POST,value="/product")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	//Put Method 
	@RequestMapping(method=RequestMethod.PUT,value="/product/{id}")
	public void  updateProduct(@PathVariable Integer id,@RequestBody Product product) {
		productService.updateProduct(id,product);
	}
	
	//Delete Method
	@RequestMapping(method=RequestMethod.DELETE,value="/product/{id}")
	public void  deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}
	
	
	
}
