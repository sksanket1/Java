package com.cjc.fwl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import jdk.jfr.Enabled;
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class FwlZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(FwlZuulApplication.class, args);
	}

}
