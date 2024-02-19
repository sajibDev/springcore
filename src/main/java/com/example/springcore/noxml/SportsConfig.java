package com.example.springcore.noxml;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Configuration
@PropertySource("classpath:application.properties")
public class SportsConfig {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    @Bean
    public CustomBeanProcessor customBeanProcessor(){
        return new CustomBeanProcessor();
    }
    @Bean
    @Scope("prototype")
    public Coach swimCoach(){
        return new SwimCoach(happyFortuneService());
    }

}
