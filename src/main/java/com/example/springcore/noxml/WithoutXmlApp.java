package com.example.springcore.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutXmlApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
        Coach swimCoach = context.getBean("swimCoach",SwimCoach.class);
        swimCoach.dailyWorkout();
        context.close();
    }
}
