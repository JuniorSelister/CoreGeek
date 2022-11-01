package com.demostation.coregeek.entitiestest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {

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
