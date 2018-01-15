package com.au.example.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayhan.Ugurlu on 15/01/2018
 */
@RestController
public class ServiceController {

    @Value(("${spring.instance.name}"))
    private String instanceName;

    @RequestMapping("/")
    public String message(){
        return "Hello from "+ instanceName;
    }
}
