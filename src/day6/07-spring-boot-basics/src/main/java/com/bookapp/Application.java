package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

//Autoconfiguration of bean
//@SpringBootApplication=@Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(Application.class, args);
//		String beans[]= ctx.getBeanDefinitionNames();
//		for(String bean: beans) {
//			System.out.println(bean);
//		}
	}

	@Override
	public void run(String... args) throws Exception {
		if(jdbcTemplate!=null)
			System.out.println("it is configured...:)");
	}

}
