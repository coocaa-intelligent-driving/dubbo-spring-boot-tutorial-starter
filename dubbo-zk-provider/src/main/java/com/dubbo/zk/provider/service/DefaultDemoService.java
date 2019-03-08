package com.dubbo.zk.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.dubbo.contract.DemoService;

@Service(version = "${provider.service.version}")
public class DefaultDemoService implements DemoService{

	@Value("${spring.application.name}")
	private String serviceName;
	
	@Override
	public String sayHello(String name) {
		return String.format("[%s] : hello , %s", serviceName,name);
	}

}
