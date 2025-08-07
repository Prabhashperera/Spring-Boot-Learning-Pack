package org.app.o12_spring_testing.controller;

import lombok.RequiredArgsConstructor;
import org.app.o12_spring_testing.entity.Product;
import org.app.o12_spring_testing.res.ApiResponse;
import org.app.o12_spring_testing.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    @GetMapping(path = "/get")
    public ResponseEntity<ApiResponse> getProducts() {
        List<Product> allProducts = productService.getAllProducts();
        return ResponseEntity.ok(
                new ApiResponse(200, "Success", allProducts)
        );
    }

    @PostMapping(path = "/create")
    public ResponseEntity<ApiResponse> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse(201, "Created successfully", savedProduct));
    }
}