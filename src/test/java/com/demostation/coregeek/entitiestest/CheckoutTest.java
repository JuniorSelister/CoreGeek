package com.demostation.coregeek.entitiestest;

import com.demostation.coregeek.base.Constraint;
import com.demostation.coregeek.entity.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CheckoutTest {

    @Test
    @DisplayName("It should return the discount of the product")
    void setup() {
        User user1;
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Address address1 = new Address("94110180", "39");
        Bank bank1 = new Bank(1, "1238941-2", "8121", "Banco do Brasil");
        Product prod1 = new Product(1, "one", 39.9, "Detail", "No Obs");
        List<Product> products = new ArrayList<>();
        products.add(prod1);
        user1 = new User(1, "Junior", "Selister", Constraint.parseDate("09/03/1992"), address1, bank1);

        Cart cart1 = new Cart(user1, prod1, 1);
        System.out.println(cart1.getPrdTotalPrice());

        Checkout checkout1 = new Checkout(cart1,"CORE20");
        System.out.println(checkout1.getTotalPriceFromCart());

    }
}
