package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {
	
	@Controller
	public class HelloController{
	@RequestMapping("/hello")
	public void hello(HttpServletResponse response) throws IOException{
		response.getWriter().print("Hello World");
	}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
