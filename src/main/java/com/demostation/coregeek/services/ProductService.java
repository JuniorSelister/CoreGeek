package com.demostation.coregeek.services;

import com.demostation.coregeek.entity.Product;
import com.demostation.coregeek.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product findProduct(Integer id) {
        Optional<Product> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public Product insert(Product obj) {
        obj.setId_prod(null);
        return repo.save(obj);
    }

    public Product update(Product obj) {
        findProduct(obj.getId_prod());
        return repo.save(obj);
    }

    public void delete(Integer id) {
        findProduct(id);
        repo.deleteById(id);
    }

    public List<Product> findAll() {
        return repo.findAll();
    }

}
