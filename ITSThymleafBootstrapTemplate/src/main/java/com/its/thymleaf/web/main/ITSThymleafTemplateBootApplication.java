package com.its.thymleaf.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ITSHare
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.its.*")
public class ITSThymleafTemplateBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(ITSThymleafTemplateBootApplication.class, "");
	}
}
