package com.example.springcore.xml;

import org.springframework.beans.factory.DisposableBean;

public class Teacher implements Employee, DisposableBean {

    private final HappyFortuneService  happyFortuneService;
    Teacher(HappyFortuneService happyFortuneService){
        this.happyFortuneService = happyFortuneService;
    }
    @Override
    public void duty() {
        System.err.println("To take class.");
        System.err.println(happyFortuneService.dailyFortune());
    }
    public void customInit(){
        System.err.println("custom init is called.");
    }

    public void customDestroy(){
        System.err.println("custom destroy is called.");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("custom destroy is called.");
    }
}
