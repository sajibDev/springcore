package com.example.springcore.masterbootcamp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.springcore.masterbootcamp")
@EnableAspectJAutoProxy
public class BeanConfig {
}
