package com.howtodoinjava.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoManagerImpl implements DemoManager, InitializingBean, DisposableBean 
{
	int x;
	public DemoManagerImpl(int x) {
		this.x = x;
	}
	
	@Override
	public String getServiceName() 
	{
		return "My first service with Spring 3"+ x;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
