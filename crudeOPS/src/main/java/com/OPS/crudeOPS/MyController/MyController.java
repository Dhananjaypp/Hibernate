package com.OPS.crudeOPS.MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OPS.crudeOPS.MyModel.Product;
import com.OPS.crudeOPS.MyService.ProductService;

@RestController
public class MyController {

	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
	return productservice.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product) {
		return productservice.saveProducts(product);
		}
	
	@GetMapping("/Product")
	public List<Product> findAllProduct() {
		return productservice.getProducts();
		}
	
	@GetMapping("/ProductById/{id}")
	public Product findByProductId(@PathVariable int id) {
		return productservice.getProductById(id);
		}
	
	@RequestMapping("/ProductByName/{name}")
	public Product findByProductName(@PathVariable  String name) {
		return productservice.getProductByName(name);
		}
	
	@DeleteMapping("/ProductDelete/{id}")
	public String deleteProductById(@PathVariable int id) {
		return productservice.deleteProduct(id);
		}
	@PutMapping("/productupdate")
	public Product UpdateProductById(Product product) {
		return productservice.Updateproduct(product);
		}
	
}
