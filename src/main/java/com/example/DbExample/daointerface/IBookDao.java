package com.example.DbExample.daointerface;

import com.example.DbExample.model.Book;
import java.util.List;

public interface IBookDao {
    
    Book addUpdate(Book book);
    
    List<Book> findAll();
    
    List<Book> findAllWithDetail();
    
    Book findById(Integer id);
    
    void delete(Book book);
    
}
