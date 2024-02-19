package com.example.springcore.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String dailyFortune() {
        return "Today is your lucky day.";
    }
}
