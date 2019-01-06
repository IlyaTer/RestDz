package com.example.DbExample.daointerface;

import com.example.DbExample.model.Purchase;
import java.util.List;

public interface IPurchaseDao {
    
    Purchase addUpdate(Purchase purchase);
    
    List<Purchase> findAll();
    
    Purchase findById(Integer id);
    
    void delete(Purchase purchase);
}
