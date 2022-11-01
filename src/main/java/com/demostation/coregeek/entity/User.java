package com.demostation.coregeek.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id_user;
    private String firstName;
    private String lastName;
    private Date dob;

    private Address address;
    private Bank bank;
//    @OneToMany
    private List<Product> listProducts;

    public User () {}

    public User(Integer id_user, String firstName, String lastName, Date dob, Address address, Bank bank, List<Product> listProducts) {
        this.id_user = id_user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.bank = bank;
        this.listProducts = listProducts;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id_user.equals(user.id_user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_user);
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", bank=" + bank +
                ", listProducts=" + listProducts +
                '}';
    }
}
