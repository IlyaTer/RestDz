package com.example.DbExample.daointerface;

import com.example.DbExample.model.Store;
import java.util.List;

public interface IStoreDao {
    
    Store addUpdate(Store store);
    
    List<Store> findAll();
    
    List<Store> findAllWithDetail();
    
    Store findById(Integer id);
    
    void delete(Store store);
}
