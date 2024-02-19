package com.example.springcore.xml;

public class SadFortuneService implements FortuneService{
    @Override
    public String dailyFortune() {
        return "Today is your unlucky day.";
    }
}
