package com.example.springcore.annotation;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach implements Coach, DisposableBean {

    private FortuneService fortuneService ;
    private String email;
    private String team;
    @Override
    public void dailyWorkout() {

        System.err.println("30 min batting practice");
        System.err.println(fortuneService.dailyFortune());
        System.err.println(email);
        System.err.println(team);

    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    void customInit(){
        System.err.println("custom init method called");
    }

    void customDestroy(){
        System.err.println("custom Destroy method called");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("custom Destroy method called");
    }
}
