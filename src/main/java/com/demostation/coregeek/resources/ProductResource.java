package com.demostation.coregeek.resources;

import com.demostation.coregeek.entity.Product;
import com.demostation.coregeek.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Locale locale = new Locale("fr", "FR");
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
    String date = dateFormat.format(new Date());

    @Autowired
    private ProductService service;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> listProducts(@PathVariable Integer id) {
        Product obj = service.findProduct(id);
        return ResponseEntity.ok().body(obj);
    }

}
