package com.Flexisaf.lib_system.service;

import org.springframework.stereotype.Service;



@Service
public class AuthorService {
    public String getAuthorInfo() {
        return "Author: Robert C. Martin – Expert in Software Engineering";
    }
}
