package com.dubbo.zk.provider.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class ZKProviderApp {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(ZKProviderApp.class)
//			.listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
//				Environment environment = event.getEnvironment();
//                int port = environment.getProperty("embedded.zookeeper.port", int.class);
//                new EmbeddedZookeeper(port, false).start();
//			})
//			.run(args);
		SpringApplication.run(ZKProviderApp.class);
	}
	
	
}
