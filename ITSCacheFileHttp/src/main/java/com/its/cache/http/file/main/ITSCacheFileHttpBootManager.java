package com.its.cache.http.file.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tuannx2
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.its.cache.*")
public class ITSCacheFileHttpBootManager {
	public static void main(String[] args) {
		SpringApplication.run(ITSCacheFileHttpBootManager.class, "");
	}
}
