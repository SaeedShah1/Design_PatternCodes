package com.practice;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		System.out.println("::::::::::  APPLICATION STARTED ::::::::::");
		SpringApplication.run(CrudApplication.class, args);
	}

}
