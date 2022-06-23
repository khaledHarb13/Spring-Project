package com.example.MissionList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.MissionList")
public class MissionListApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionListApplication.class, args);
		System.out.println("Good Luck");
	}

}
