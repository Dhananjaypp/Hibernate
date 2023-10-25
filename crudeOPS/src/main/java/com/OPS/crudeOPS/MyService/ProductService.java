package com.OPS.crudeOPS.MyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPS.crudeOPS.MyModel.Product;
import com.OPS.crudeOPS.Rpository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
		
	}
	
	public List<Product> saveProducts(List<Product> product) {
		return repository.saveAll(product);
		
	}
	
	public List<Product> getProducts() {
		return repository.findAll();
		
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
		
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name).orElse(null);
		
	}

	public String deleteProduct(int id) {
		 repository.deleteById(id);
		return "Product is Successfully Removed";
		
	}
	
	public Product Updateproduct(Product product) {
		Product prdt= repository.findById(product.getId()).orElse(null);
		prdt.setName(product.getName());
		prdt.setQuantity(product.getQuantity());
		prdt.setPrice(product.getPrice());
		return repository.save(prdt);
		
	}
}
