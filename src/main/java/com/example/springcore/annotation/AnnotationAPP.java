package com.example.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAPP {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
        Coach tennisCoach = context.getBean("tennisCoach",TennisCoach.class);
        Coach anotherTennisCoach = context.getBean("tennisCoach",TennisCoach.class);
        System.err.println(tennisCoach==anotherTennisCoach);
        tennisCoach.dailyWorkout();
        context.close();

    }

}
