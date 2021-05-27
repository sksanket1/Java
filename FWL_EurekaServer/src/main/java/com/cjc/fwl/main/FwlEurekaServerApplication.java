package com.cjc.fwl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class FwlEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FwlEurekaServerApplication.class, args);
	}

}
