package com.example.DbExample.returnmodels;

import com.example.DbExample.model.Book;

public class JBook {
    
    private Integer id;
    private String name;
    private Double price;
    private String storage;
    private Integer count;

    public JBook() {
    }

    public JBook(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.price = book.getPrice();
        this.storage = book.getStorage();
        this.count = book.getCount();
    }

    public JBook(Integer id, String name, Double price, String storage, Integer count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
        this.count = count;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    
    
    
}
