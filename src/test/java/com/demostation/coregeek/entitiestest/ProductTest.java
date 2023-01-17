package com.demostation.coregeek.entitiestest;

import com.demostation.coregeek.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import java.text.ParseException;

public class ProductTest {

    Product prod = new Product(1, "one", 39.9, "Detail", "No Obs");

    public ProductTest() throws ParseException {
    }

    @Test
    @Description("It should return the information of the product")
    public void itShouldReturnTheProduct() {
        Product product = new Product(2, "t-shirt", 49.9, "CoreGeek t-shirt", "No obs");
        System.out.println(product);
    }

}
