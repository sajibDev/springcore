package com.example.springcore.annotation;

import com.example.springcore.xml.Employee;
import com.example.springcore.xml.SadFortuneService;

public class Programmer implements Employee {

    private com.example.springcore.xml.SadFortuneService sadFortuneService;
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
