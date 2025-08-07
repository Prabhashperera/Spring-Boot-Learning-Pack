package org.app.o12_spring_testing;

import org.app.o12_spring_testing.entity.Product;
import org.app.o12_spring_testing.repo.ProductRepo;
import org.app.o12_spring_testing.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
    @InjectMocks
    private ProductServiceImpl productService;
    @Mock
    private ProductRepo productRepo;
    private Product product;
}
