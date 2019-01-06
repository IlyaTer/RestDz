package com.example.DbExample.controllers;

import com.example.DbExample.returnmodels.JCustomer;
import com.example.DbExample.services.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class CustomerController {

    private static class Message {

        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    @Autowired
    private CustomerService customers;

    @RequestMapping(value = "/buyer/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public JCustomer buyerByid(@PathVariable("id") Integer id) {
        return customers.findById(id);
    }

    @RequestMapping(value = "/buyer", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<JCustomer> buyer() {
        return customers.findAll();
    }

    @RequestMapping(value = "/buyer/{id}", method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Message delBuyerByid(@PathVariable("id") Integer id) {
        JCustomer cust = customers.findById(id);
        Message message = new Message();
        if(cust.getId() == null)
        {
            message.setMessage("No such buyer!");
            return message;
        }
        try {
            customers.delete(cust);
            message.setMessage("Buyer has deleted!");
        } catch (Exception e) {
            message.setMessage("Buyer has not deleted!");
        } finally {
            return message;
        }
    }//end
}
