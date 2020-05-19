package com.lukasz.demo.service;

import com.lukasz.demo.domain.Product;
import com.lukasz.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(50.10, 20, "Mleko łaciate", "Mleko 1"));
        products.add(new Product(700.00, 20, "Mleko łaciate", "Mleko 2"));
        products.add(new Product(23.00, 20, "Mleko łaciate", "Mleko 3"));
        products.add(new Product(456.00, 20, "Mleko łaciate", "Mleko 4"));
        products.add(new Product(5064.00, 20, "Mleko łaciate", "Mleko 5"));
        products.add(new Product(5023.00, 20, "Mleko łaciate", "Mleko 6"));
        products.add(new Product(120.00, 20, "Mleko łaciate", "Mleko 7"));
        products.add(new Product(23.00, 20, "Mleko łaciate", "Mleko 8"));

    }


    public void saveInitialBatch() {
        productRepository.save(products);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }


}
