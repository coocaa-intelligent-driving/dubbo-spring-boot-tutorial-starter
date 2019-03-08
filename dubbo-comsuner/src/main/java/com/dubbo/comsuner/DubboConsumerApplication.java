package com.dubbo.comsuner;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dubbo.contract.DemoService;

@EnableAutoConfiguration
@SpringBootApplication
public class DubboConsumerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DubboConsumerApplication.class.getName());
	
	@Reference(version="1.0.0",url="dubbo://127.0.0.1:12345")
	private DemoService demoService;
	
	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}

}
