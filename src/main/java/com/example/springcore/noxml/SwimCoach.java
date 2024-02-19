package com.example.springcore.noxml;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach, DisposableBean {
    @Value("${email}")
    private String email;
    @Value("${team}")
    private String team;
    private FortuneService fortuneService;
    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public void dailyWorkout() {
        System.err.println("1 hour for swimming.");
        System.err.println(fortuneService.dailyFortune());
        System.err.println(email);
        System.err.println(team);
    }

    @PostConstruct
    public void customInit(){
        System.err.println("Custom init called.");
    }

    @PreDestroy
    public void customDestroy(){
        System.err.println("Custom destroy called.");
    }

    @Override
    public void destroy() throws Exception {
        customDestroy();
    }
}
