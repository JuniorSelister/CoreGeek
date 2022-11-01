package com.demostation.coregeek.entity;

import java.io.Serializable;
import java.util.Objects;

public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id_bank;
    private String accountNumber;
    private String agency;
    private String bankName;

    public Bank () {}

    public Bank(Integer id_bank, String accountNumber, String agency, String bankName) {
        this.id_bank = id_bank;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.bankName = bankName;
    }

    public Integer getId_bank() {
        return id_bank;
    }

    public void setId_bank(Integer id_bank) {
        this.id_bank = id_bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return id_bank.equals(bank.id_bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_bank);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id_bank=" + id_bank +
                ", accountNumber='" + accountNumber + '\'' +
                ", agency='" + agency + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
