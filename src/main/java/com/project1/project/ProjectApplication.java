package com.project1.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
        Dev obj=context.getBean(Dev.class);  //getbean is used to get the object created from context..//Dev.class means which class's object is to be created
		obj.build();
	}
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		Dev obj=context.getBean(Dev.class);  //getbean is used to get the object created from context..//Dev.class means which class's object is to be created
		obj.build();
	}
}
