package com.example.DbExample.services;

import com.example.DbExample.returnmodels.JCustomer;
import java.util.List;


public interface CustomerService {
    
    JCustomer add(JCustomer customer);
    
    JCustomer update(JCustomer customer);
    
    List<JCustomer> findAll();
    
    int countRow();
    
    JCustomer findById(Integer id);
    
    void delete(JCustomer customer);  
    
}
