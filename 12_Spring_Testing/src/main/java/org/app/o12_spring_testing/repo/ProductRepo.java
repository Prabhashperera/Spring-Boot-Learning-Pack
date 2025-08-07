package org.app.o12_spring_testing.repo;

import org.app.o12_spring_testing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> getProductById(int id);

    Product getProductsById(int id);

    Product deleteProductById(int id);
}
