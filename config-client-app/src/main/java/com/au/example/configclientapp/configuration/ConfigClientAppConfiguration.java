package com.au.example.configclientapp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Ayhan.Ugurlu on 15/01/2018
 */
@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientAppConfiguration {

    private  String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
