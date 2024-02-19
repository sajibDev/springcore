package com.example.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.springcore.noxml")
@PropertySource("classpath:application.properties")
public class EmployeeConfig {

    @Bean
    public Employee teacher(){
        return new Teacher();
    }
}
