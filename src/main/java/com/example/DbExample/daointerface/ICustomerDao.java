package com.example.DbExample.daointerface;

import com.example.DbExample.model.Customer;
import java.util.List;

public interface ICustomerDao {
    
    Customer addUpdate(Customer customer);
    
    List<Customer> findAll();
    
    List<Customer> findAllWithDetail();
    
    Customer findById(Integer id);
    
    void delete(Customer customer);
    
}
