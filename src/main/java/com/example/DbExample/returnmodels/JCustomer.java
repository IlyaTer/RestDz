package com.example.DbExample.returnmodels;

import com.example.DbExample.model.Customer;

public class JCustomer {

    private Integer id;
    private String surname;
    private String district;
    private Double discount;

    public JCustomer() {
    }

    public JCustomer(Customer customer) {
        if (customer != null) {
            this.id = customer.getId();
            this.surname = customer.getSurname();
            this.district = customer.getDistrict();
            this.discount = customer.getDiscount();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

}
