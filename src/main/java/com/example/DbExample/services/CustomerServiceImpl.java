package com.example.DbExample.services;

import com.example.DbExample.daointerface.ICustomerDao;
import com.example.DbExample.model.Customer;
import com.example.DbExample.returnmodels.JCustomer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private ICustomerDao customer;
    
    @Override
    public JCustomer add(JCustomer customer) {
        Customer cust = new Customer();
        cust.setSurname(customer.getSurname());
        cust.setDistrict(customer.getDistrict());
        cust.setDiscount(customer.getDiscount());
        
        customer.setId(this.customer.addUpdate(cust).getId());
        
        return customer;
    }

    @Override
    public JCustomer update(JCustomer customer) {
        Customer cust = new Customer();
        cust.setSurname(customer.getSurname());
        cust.setDistrict(customer.getDistrict());
        cust.setDiscount(customer.getDiscount());
        
        customer.setId(this.customer.addUpdate(cust).getId());
        
        return customer;
    }

    @Override
    public List<JCustomer> findAll() {
        List<JCustomer> jcustomers = new ArrayList<>();
        
        for(Customer c: customer.findAll())
        {
            jcustomers.add(new JCustomer(c));
        }
        
        return jcustomers;
    }

    @Override
    public int countRow() {
        return customer.findAll().size();
    }

    @Override
    public JCustomer findById(Integer id) {
        System.out.println(customer.findById(id));
        System.out.println(customer.findById(id).getPurchases());
        return new JCustomer(customer.findById(id));
    }
    
    @Override
    public void delete(JCustomer customer) {
        Customer cust = new Customer();
        cust.setSurname(customer.getSurname());
        cust.setDistrict(customer.getDistrict());
        cust.setDiscount(customer.getDiscount());
        cust.setId(customer.getId());
        
        this.customer.delete(cust);
    }
    
    
}//end Service customer
