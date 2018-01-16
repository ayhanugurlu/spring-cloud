package com.au.example.configclientapp.controller;

import com.au.example.configclientapp.configuration.ConfigClientAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayhan.Ugurlu on 15/01/2018
 */
@RestController
@RefreshScope
public class ConfigClientController {


    @Autowired
    private ConfigClientAppConfiguration properties;

    @Value("${some.other.property}")
    private String someOtherProperty;

    @RequestMapping
    public String printConfig(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(properties.getProperty());
        stringBuilder.append(" | ");
        stringBuilder.append(someOtherProperty);
        return stringBuilder.toString();
    }


}



