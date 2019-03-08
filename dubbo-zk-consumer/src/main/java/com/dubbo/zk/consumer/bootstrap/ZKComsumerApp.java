package com.dubbo.zk.consumer.bootstrap;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.dubbo.contract.DemoService;

@EnableAutoConfiguration
public class ZKComsumerApp {

	private static final Logger logger = LoggerFactory.getLogger(ZKComsumerApp.class);
	
	@Reference(version = "${comsumer.service.version}")
	private DemoService demoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ZKComsumerApp.class).close();
	}
	
	@Bean
	public ApplicationRunner runner() {
		
		return args -> {
			logger.error(demoService.sayHello("cody"));
		};
	}
}
