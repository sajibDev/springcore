package com.example.springcore.masterbootcamp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {

    private final Qualification qualification;
    Doctor(Qualification qualification){
        this.qualification = qualification;
    }
    @Override
    public void duty() {
        System.err.println("Doctors Duty.");
        System.err.println("Qualification "+qualification.degree);
    }

}
