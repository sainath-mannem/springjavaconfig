package com.howtodoinjava.core.config.spring;

import org.springframework.stereotype.Component;

import com.howtodoinjava.core.beans.DemoManager;

@Component("demoManager2")
public class DemoManagerImpl2 implements DemoManager 
{
	@Override
	public String getServiceName() 
	{
		return "My first service with Spring 4";
	}
}
