package mbi.sds.service;

import java.util.List;

import mbi.sds.entity.Product;

public interface ProductService {
	List<Product> getAllProducts();

	Product getProductById(Long id);

	Product saveProduct(Product product);

	void deleteProduct(Long id);
}
