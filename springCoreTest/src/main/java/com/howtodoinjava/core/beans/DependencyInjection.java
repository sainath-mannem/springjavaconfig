package com.howtodoinjava.core.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class DependencyInjection implements InitializingBean {
	
	@Autowired
	private DemoManager demoManager;
	public DependencyInjection() {
		//demoManager.getServiceName();// null pointer
	}
	
	

	public void display() {
		System.out.println(demoManager);
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		demoManager.getServiceName();
	}
}
