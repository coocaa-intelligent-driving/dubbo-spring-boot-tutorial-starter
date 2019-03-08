package com.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.dubbo.contract.DemoService;

@Service(version="1.0.0")
public class DefaultDemoService implements DemoService{

	@Value("${dubbo.application.name}")
	private String serviceName;
	
	public String sayHello(String name) {
		return serviceName + " hi " + name;
	}
	
}
