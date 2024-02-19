package com.example.springcore.annotation;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("teacher")
public class Teacher implements Employee, DisposableBean {
    @Value("${email}")
    private String email;

    @Override
    public void duty() {
        System.err.println("To take class.");
        System.err.println(email);

    }

    @PostConstruct
    private void customInit(){
        System.err.println("Custom init called");
    }

    @PreDestroy
    private void customDestroy(){
        System.err.println("Custom destroy called");
    }


    @Override
    public void destroy() throws Exception {
        customDestroy();
    }
}
