package com.demostation.coregeek.resources;

import com.demostation.coregeek.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Locale locale = new Locale("fr", "FR");
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
    String date = dateFormat.format(new Date());


    @RequestMapping(method = RequestMethod.GET)
    public List<Product> listProducts() {
        Product prod1;
        prod1 = new Product(1, "T-shirt Batman", 59.90, "T-shirt produced with 100% of cotton.", "");

        Product prod2;
        prod2 = new Product(2, "T-shirt Born To Be Geek", 59.90, "T-shirt produced with 100% of cotton.", "");

        List<Product> products = new ArrayList<>();
        products.add(prod1);
        products.add(prod2);

        return products;
    }

}
