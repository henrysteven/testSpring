package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.repository.MyRepository;
import com.test.demo.service.MyFirstService;

@RestController
@RequestMapping("/api")
public class MyFirstController {
    @Autowired
    private MyFirstService myFirstService;

    @GetMapping("/service")
    public String fetchData() {
        return myFirstService.getDataService();
    }

}
