package com.example.springcore.xml;

public class Programmer implements Employee{

    private  SadFortuneService sadFortuneService;
    private String email;
    @Override
    public void duty() {
        System.err.println("Writing code.");
        System.err.println(sadFortuneService.dailyFortune());
        System.err.println(email);
    }

    public void setSadFortuneService(SadFortuneService sadFortuneService) {
        this.sadFortuneService = sadFortuneService;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
