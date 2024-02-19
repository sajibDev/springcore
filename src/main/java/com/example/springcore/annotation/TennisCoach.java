package com.example.springcore.annotation;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements  Coach, DisposableBean {
    private final FortuneService fortuneService ;
    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;
    @Autowired
    public TennisCoach( @Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
    public void dailyWorkout() {
        System.err.println("Get 1 hour tennis practice.");
        System.err.println(fortuneService.dailyFortune());
        System.err.println(team);
        System.err.println(email);
    }

    @Override
    public void destroy() throws Exception {
        customDestroy();
    }
}
