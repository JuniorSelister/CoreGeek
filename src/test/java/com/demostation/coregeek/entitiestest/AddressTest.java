package com.demostation.coregeek.entitiestest;

import com.demostation.coregeek.base.Constraint;
import com.demostation.coregeek.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddressTest {

    @Test
    @DisplayName("It should return the address name")
    public void testAddressName() {
        String postalCode = "94110-180";
        Address address = new Address(Constraint.POSTALCODE(postalCode));
        System.out.println(address.getAddressName() + " " + Constraint.POSTALCODE(postalCode));
        Assertions.assertEquals("Augusto Pestana", address.getAddressName());
    }
}
