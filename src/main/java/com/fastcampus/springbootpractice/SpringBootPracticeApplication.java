package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@EnableConfigServer
@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootPracticeApplication {
	@Value("${my.height}")
	private Integer height;


	private final Integer height2;


	private final Environment environment;
	private final ApplicationContext applicationContext;
	private final MyProperties myProperties;

	public SpringBootPracticeApplication(@Value("${my.height2}") Integer height2, Environment environment, ApplicationContext applicationContext, MyProperties myProperties) {
		this.height2 = height2;
		this.environment = environment;
		this.applicationContext = applicationContext;
		this.myProperties = myProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}


	@PostConstruct
	public void inti(){
		System.out.println("[@Value] "+ height);
		System.out.println("[@Value] "+ height2);
		System.out.println("[Environment] "+ environment.getProperty("my.height"));
		System.out.println("[ApplicationContext] "+ applicationContext.getEnvironment().getProperty("my.height2"));
		System.out.println("[configurationProps]"+ myProperties.getHeight());
	}


}
