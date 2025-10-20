package com.Flexisaf.lib_system.controller;

import com.Flexisaf.lib_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldInjectionController {
    @Autowired
    private BookService bookService;

    @GetMapping("/field/book")
    public String getBookInfo() {
        return bookService.getBookInfo();
    }

}
