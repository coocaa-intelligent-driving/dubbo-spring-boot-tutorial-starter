package com.dubbo.comsuner.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.contract.DemoService;

@RestController
public class GreetController {

	private static final Logger logger = LoggerFactory.getLogger(GreetController.class);

	@Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
	private DemoService demoService;

	@RequestMapping("sayHello")
	public Object sayHello() {
		logger.info("ts = " + System.currentTimeMillis());
		return demoService.sayHello("cody");
	}

}
