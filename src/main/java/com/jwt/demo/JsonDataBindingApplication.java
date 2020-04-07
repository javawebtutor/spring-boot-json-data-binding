package com.jwt.demo;

import java.io.File;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jwt.demo.model.Employee;

@SpringBootApplication
public class JsonDataBindingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JsonDataBindingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//create objectmapper instance
		ObjectMapper mapper = new ObjectMapper();
		
		//read json file and convert to Customer Object
		Employee employee = mapper.readValue(new File("employee.json"), Employee.class);
		
		System.out.println(employee);
		
	}

}
