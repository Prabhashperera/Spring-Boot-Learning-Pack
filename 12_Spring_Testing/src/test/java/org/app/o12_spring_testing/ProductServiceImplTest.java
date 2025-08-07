package org.app.o12_spring_testing;

import org.app.o12_spring_testing.entity.Product;
import org.app.o12_spring_testing.repo.ProductRepo;
import org.app.o12_spring_testing.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
    @InjectMocks
    private ProductServiceImpl productService;
    @Mock
    private ProductRepo productRepo;
    private Product product;

    @BeforeEach
    public void setUp() {
        product = Product.builder()
                .id(1)
                .name("Test Product")
                .price(200)
                .build();
    }

    @Test
    void shouldSaveProduct() {
        when(productRepo.save(any(Product.class))).thenReturn(product);

        Product saveProduct = productService.createProduct(product);
        Assertions.assertNotNull(saveProduct);
        Assertions.assertEquals(product.getId(), saveProduct.getId());
        Assertions.assertEquals(product.getName(), saveProduct.getName());
        Assertions.assertEquals(product.getPrice(), saveProduct.getPrice());
        verify(productRepo, times(1)).save(any(Product.class));
    }

    @Test
    void shouldUpdateProduct() {
        when(productRepo.save(any(Product.class))).thenReturn(product);

        Product saveProduct = productService.createProduct(product);
        Assertions.assertNotNull(saveProduct);
        Assertions.assertEquals(product.getId(), saveProduct.getId());
        Assertions.assertEquals(product.getName(), saveProduct.getName());
        Assertions.assertEquals(product.getPrice(), saveProduct.getPrice());
        verify(productRepo, times(1)).save(any(Product.class));
    }
}
