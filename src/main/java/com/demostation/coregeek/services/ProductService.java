package com.demostation.coregeek.services;

import com.demostation.coregeek.entity.Product;
import com.demostation.coregeek.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repo;

    public Product findProduct(Integer id) {
        Optional<Product> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
