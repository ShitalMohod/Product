package com.product.service;
import java.util.List;
import com.product.entity.Product;

public interface ProductService {
	public boolean saveProduct(Product product);
	public Product getProductById(long productId);
	public List<Product> getAllProducts(int pageNumber);
	
	public boolean deleteProductById(long productId);
	public boolean updateProduct(Product product);
 
}
