package com.demostation.coregeek.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CreditCard implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id_accountNumber;
    private String creditNumber;
    private Date dateExpiration;
    private String cvv;

    public CreditCard () {}

    public CreditCard(Integer id_accountNumber, String creditNumber, Date dateExpiration, String cvv) {
        this.id_accountNumber = id_accountNumber;
        this.creditNumber = creditNumber;
        this.dateExpiration = dateExpiration;
        this.cvv = cvv;
    }

    public Integer getId_accountNumber() {
        return id_accountNumber;
    }

    public void setId_accountNumber(Integer id_accountNumber) {
        this.id_accountNumber = id_accountNumber;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return id_accountNumber.equals(that.id_accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_accountNumber);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id_accountNumber=" + id_accountNumber +
                ", creditNumber='" + creditNumber + '\'' +
                ", dateExpiration=" + dateExpiration +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
