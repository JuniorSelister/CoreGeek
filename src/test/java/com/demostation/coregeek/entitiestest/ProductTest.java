package com.demostation.coregeek.entitiestest;

import com.demostation.coregeek.base.Constraint;
import com.demostation.coregeek.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProductTest {

    Locale locale = new Locale("pt", "BR");
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);

    String pattern = "dd/MM/yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    String date = sdf.format(new Date());
    Date dateM = sdf.parse("09/03/1992");

    Product prod = new Product(1, "one", 39.9, "Detail", "No Obs");

    public ProductTest() throws ParseException {
    }

    @Test
    @Description("It should return a date from Brazil to understand standards")
    public void getSpecificDate() throws ParseException {
        System.out.println(dateM);
        System.out.println(sdf.format(dateM));
        System.out.println(Constraint.setDateNow());
    }

    @Test
    @Description("It should return the date from object instanced")
    public void getDateNow() {
        System.out.println(prod.getDateNow());
    }

}
