package com.demostation.coregeek.entity;

import com.demostation.coregeek.base.Constraint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prod;
    private String prdName;
    private Double prdPrice;
    private String prdDetail;
    private String prdObservation;
    private String prdImg;
    private Date prdDateInserted;
    private Date prdDateEdited;
    private Date prdDateDeleted;

    public Product () {}

    public Product(Integer id_prod, String prdName, Double prdPrice, String prdDetail, String prdObservation) {
        this.id_prod = id_prod;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdDetail = prdDetail;
        this.prdObservation = prdObservation;
        this.prdDateInserted = new Date();
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

    public Date getPrdDateInserted() {
        return prdDateInserted;
    }

    public String getDateNow() {
        return Constraint.getDate(prdDateInserted);
    }

    public void setPrdDateInserted(Date prdDateInserted) {
        this.prdDateInserted = prdDateInserted;
    }

    public Date getPrdDateEdited() {
        return prdDateEdited;
    }

    public void setPrdDateEdited(Date prdDateEdited) {
        this.prdDateEdited = prdDateEdited;
    }

    public Date getPrdDateDeleted() {
        return prdDateDeleted;
    }

    public void setPrdDateDeleted(Date prdDateDeleted) {
        this.prdDateDeleted = prdDateDeleted;
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
