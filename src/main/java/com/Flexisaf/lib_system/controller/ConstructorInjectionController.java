package com.Flexisaf.lib_system.controller;

import com.Flexisaf.lib_system.service.BorrowerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionController {
    private final BorrowerService borrowerService;

    public ConstructorInjectionController(BorrowerService borrowerService) {
        this.borrowerService = borrowerService;
    }

    @GetMapping("/constructor/borrower")
    public String getBorrowerInfo() {
        return borrowerService.getBorrowerInfo();
    }

}
