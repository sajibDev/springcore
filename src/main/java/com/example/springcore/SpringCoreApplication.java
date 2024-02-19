package com.example.springcore;


import com.example.springcore.noxml.Employee;
import com.example.springcore.noxml.EmployeeConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		Employee teacher = container.getBean("teacher",Employee.class);
		teacher.duty();

		container.close();

	}

}

