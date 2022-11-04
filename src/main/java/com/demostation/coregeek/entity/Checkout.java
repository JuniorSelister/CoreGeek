package com.demostation.coregeek.entity;

import java.util.Date;

public class Checkout {

    private Cart cart;
    private String checkDiscount;
    private Date checkDate;

    public Checkout(Cart cart, String discountTicket) {
        this.checkDiscount = discountTicket.toUpperCase();
        this.cart = cart;

        if (checkDiscount.equals("CORE10")) {
            cart.setPrdTotalPrice(cart.getPrdTotalPrice() - (0.10 * 100));
        } else if (checkDiscount.equals("CORE20")) {
            cart.setPrdTotalPrice(cart.getPrdTotalPrice() - (0.20 * 100));
        } else if (checkDiscount.equals("CORE50")) {
            cart.setPrdTotalPrice(cart.getPrdTotalPrice() - (0.50 * 100));
        } else {
            cart.getPrdTotalPrice();
        }
    }

    public Double getTotalPriceFromCart() {
        return cart.getPrdTotalPrice();
    }

}
