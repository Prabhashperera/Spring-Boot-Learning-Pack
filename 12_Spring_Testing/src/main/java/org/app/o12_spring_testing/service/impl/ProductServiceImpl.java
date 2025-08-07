package org.app.o12_spring_testing.service.impl;

import lombok.RequiredArgsConstructor;
import org.app.o12_spring_testing.entity.Product;
import org.app.o12_spring_testing.repo.ProductRepo;
import org.app.o12_spring_testing.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Product with id " + id + " not found")
        );
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existProduct = productRepo.getProductsById(product.getId());
        existProduct.setName(product.getName());
        existProduct.setPrice(product.getPrice());
        return productRepo.save(existProduct);
    }

    @Override
    public Product deleteProduct(int id) {
        return productRepo.deleteProductById(id);
    }
}
