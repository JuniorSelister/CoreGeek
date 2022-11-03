package com.demostation.coregeek.resources;

import com.demostation.coregeek.base.Constraint;
import com.demostation.coregeek.entity.Address;
import com.demostation.coregeek.entity.Bank;
import com.demostation.coregeek.entity.Product;
import com.demostation.coregeek.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> listUsers() {
        Address address1 = new Address("94110180");
        Bank bank1 = new Bank(1, "1238941-2", "8121", "Banco do Brasil");
        Product prod1 = new Product(1, "one", 39.9, "Detail", "No Obs");
        List<Product> products = new ArrayList<>();
        products.add(prod1);
        User user1 = new User(1, "Junior", "Selister", Constraint.parseDate("09/03/1992"), address1, bank1, products);

        List<User> users = new ArrayList<>();
        users.add(user1);

        return users;
    }

}
