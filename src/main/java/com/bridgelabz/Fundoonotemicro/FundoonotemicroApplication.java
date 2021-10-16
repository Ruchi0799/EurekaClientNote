package com.bridgelabz.Fundoonotemicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
@EnableEurekaClient
public class FundoonotemicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundoonotemicroApplication.class, args);
		
	}
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}

}
