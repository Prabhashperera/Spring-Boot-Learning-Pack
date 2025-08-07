package org.app.o12_spring_testing.service;

import org.app.o12_spring_testing.entity.Product;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product createProduct(Product product);
    Product updateProduct(Product product);
    Product deleteProduct(int id);
}
