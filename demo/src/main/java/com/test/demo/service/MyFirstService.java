package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.repository.MyRepository;

@Service
public class MyFirstService {
    
    @Autowired
    private MyRepository myRepository;

    public String getDataService() {
        return myRepository.fetchData();
    }




}
