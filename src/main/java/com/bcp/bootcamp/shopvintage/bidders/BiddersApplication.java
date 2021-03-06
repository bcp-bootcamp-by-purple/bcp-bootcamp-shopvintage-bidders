package com.bcp.bootcamp.shopvintage.bidders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class BiddersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiddersApplication.class, args);
	}

}
