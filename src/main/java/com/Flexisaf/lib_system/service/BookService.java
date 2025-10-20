package com.Flexisaf.lib_system.service;


import org.springframework.stereotype.Service;



@Service
public class BookService {
    public String getBookInfo() {
        return "Book: Clean Code by Robert C. Martin";
    }
}
