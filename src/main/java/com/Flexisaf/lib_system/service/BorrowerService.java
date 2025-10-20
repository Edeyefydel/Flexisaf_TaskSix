package com.Flexisaf.lib_system.service;

import org.springframework.stereotype.Service;

@Service
public class BorrowerService {
    public String getBorrowerInfo() {
        return "Borrower: John Doe – Active Member";
    }
}
