package com.au.example.configclientapp;

import com.au.example.configclientapp.configuration.ConfigClientAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppApplication.class, args);
	}
}
