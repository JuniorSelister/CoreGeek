package com.demostation.coregeek.entity;

import com.demostation.coregeek.base.Constraint;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id_prod;
    private String prdName;
    private Double prdPrice;
    private String prdDetail;
    private String prdObservation;
    private String prdImg;
    private String prdDateInserted; // This will come as default once inserted
    private String prdDateEdited; // After modified this will come as default
    private String prdDateDeleted; // Sema rule as above

    public Product () {}

    public Product(Integer id_prod, String prdName, Double prdPrice, String prdDetail, String prdObservation) throws ParseException {
        this.id_prod = id_prod;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdDetail = prdDetail;
        this.prdObservation = prdObservation;
        this.prdDateInserted = Constraint.setDateNow();
        this.prdDateEdited = "";
        this.prdDateDeleted = "";
    }

    public Integer getId_prod() {
        return id_prod;
    }

    public void setId_prod(Integer id_prod) {
        this.id_prod = id_prod;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public Double getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(Double prdPrice) {
        this.prdPrice = prdPrice;
    }

    public String getPrdDetail() {
        return prdDetail;
    }

    public void setPrdDetail(String prdDetail) {
        this.prdDetail = prdDetail;
    }

    public String getPrdObservation() {
        return prdObservation;
    }

    public void setPrdObservation(String prdObservation) {
        this.prdObservation = prdObservation;
    }

    public String getPrdDateInserted() {
        return prdDateInserted;
    }

    public void setPrdDateInserted(String prdDateInserted) throws ParseException {
        this.prdDateInserted = Constraint.setNewDateRecord(prdDateInserted);
    }

    public String getPrdDateEdited() throws ParseException {
        return Constraint.getDate(prdDateEdited);
    }

    public void setPrdDateEdited(String prdDateEdited) throws ParseException {
        this.prdDateEdited = Constraint.setNewDateRecord(prdDateEdited);
    }

    public String getPrdDateDeleted() throws ParseException {
        return Constraint.getDate(prdDateDeleted);
    }

    public void setPrdDateDeleted(String prdDateDeleted) throws ParseException {
        this.prdDateDeleted = Constraint.setNewDateRecord(prdDateDeleted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id_prod.equals(product.id_prod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_prod);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_prod=" + id_prod +
                ", prdName='" + prdName + '\'' +
                ", prdPrice=" + prdPrice +
                ", prdDetail='" + prdDetail + '\'' +
                ", prdObservation='" + prdObservation + '\'' +
                ", prdDateInserted=" + prdDateInserted +
                ", prdDateEdited=" + prdDateEdited +
                ", prdDateDeleted=" + prdDateDeleted +
                '}';
    }
}
