package com.Flexisaf.lib_system.controller;

import com.Flexisaf.lib_system.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SetterInjectionController {
    private AuthorService authorService;

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/setter/author")
    public String getAuthorInfo() {
        return authorService.getAuthorInfo();
    }

}
