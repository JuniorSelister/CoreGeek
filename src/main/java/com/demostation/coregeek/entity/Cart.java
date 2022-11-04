package com.demostation.coregeek.entity;

import java.util.Date;

public class Cart {

    private User id_user;
    private Product id_prod;

    private int prdQuantity;

    private Double prdTotalPrice;
    private Date dateCart;

    public Cart(User id_user, Product id_prod, int prdQuantity) {
        this.id_user = id_user;
        this.id_prod = id_prod;
        this.prdQuantity = prdQuantity;
        this.prdTotalPrice = id_prod.getPrdPrice() * prdQuantity;
        // It should take a time to think how to populate dateCart
    }

    public Double getPrdTotalPrice() {
        return prdTotalPrice;
    }

    public void setPrdTotalPrice(Double prdTotalPrice) {
        this.prdTotalPrice = prdTotalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id_user=" + id_user +
                ", id_prod=" + id_prod +
                ", prdQuantity=" + prdQuantity +
                ", prdTotalPrice=" + prdTotalPrice +
                ", dateCart=" + dateCart +
                '}';
    }
}
