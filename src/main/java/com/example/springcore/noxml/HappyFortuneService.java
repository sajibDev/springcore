package com.example.springcore.noxml;

public class HappyFortuneService implements FortuneService{
    @Override
    public String dailyFortune() {
        return "Today is your lucky day.";
    }
}
