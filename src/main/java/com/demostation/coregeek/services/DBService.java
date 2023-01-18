package com.demostation.coregeek.services;

import com.demostation.coregeek.entity.Person;
import com.demostation.coregeek.entity.Product;
import com.demostation.coregeek.repositories.ProductRepository;
import com.demostation.coregeek.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    public void instantiateTestDatabase() throws ParseException {

        Person person1 = new Person(null, "Junior", "Selister", false);

        Product product1 = new Product(null, "T-shirt 1", 49.9, "CoreGeek t-shirt", "No obs");
        Product product2 = new Product(null, "T-shirt 2", 49.9, "CoreGeek t-shirt", "No obs");
        Product product3 = new Product(null, "T-shirt 3", 49.9, "CoreGeek t-shirt", "No obs");
        Product product4 = new Product(null, "T-shirt 4", 49.9, "CoreGeek t-shirt", "No obs");
        Product product5 = new Product(null, "T-shirt 5", 49.9, "CoreGeek t-shirt", "No obs");
        Product product6 = new Product(null, "T-shirt 6", 49.9, "CoreGeek t-shirt", "No obs");

        userRepository.saveAll(Arrays.asList(person1));
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5, product6));

    }
}
