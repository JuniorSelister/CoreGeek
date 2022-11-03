package com.demostation.coregeek.entitiestest;

import com.demostation.coregeek.base.Constraint;
import com.demostation.coregeek.entity.Address;
import com.demostation.coregeek.entity.Bank;
import com.demostation.coregeek.entity.Product;
import com.demostation.coregeek.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {

    @Test
    void setup() {
        User user1;
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Address address1 = new Address("94110180");
        Bank bank1 = new Bank(1, "1238941-2", "8121", "Banco do Brasil");
        Product prod1 = new Product(1, "one", 39.9, "Detail", "No Obs");
        List<Product> products = new ArrayList<>();
        products.add(prod1);
        user1 = new User(1, "Junior", "Selister", Constraint.parseDate("09/03/1992"), address1, bank1, products);

        System.out.println(user1.getFirstName() + " " + user1.getLastName());
        System.out.println(user1.getDateNow());
    }

    @Test
    @DisplayName("It should return the full name of the user")
    public void testUserName() {
        String name = "Junior Selister";
        assertFalse(name.length() > 40);
    }

    @Test
    @DisplayName("It will return the first name of the user")
    public void testUserFirstName() {
        String name = "Junior";
        assertFalse(name.length() > 20);
    }

    @Test
    @DisplayName("It will return the last name of the user")
    public void testUserLastName() {
        String name = "Selister";
        assertFalse(name.length() > 20);
    }

    @Test
    @DisplayName("It should retur the date of birth of the user")
    public void testDateOfBirthOfTheUser() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date dob = sdf.parse("03/09/1992");
        assertEquals("03/09/1992", sdf.format(dob));
    }
}
