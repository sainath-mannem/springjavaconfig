package com.howtodoinjava.core.verify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.howtodoinjava.core.beans.DemoManager;
import com.howtodoinjava.core.beans.DependencyInjection;
import com.howtodoinjava.core.config.ApplicationConfiguration;
import com.howtodoinjava.core.config.ApplicationConfiguration2;

public class VerifySpringCoreFeature 
{
	public static void main(String[] args) 
	{
		//test(new AnnotationConfigApplicationContext(ApplicationConfiguration.class));
		
		test(new AnnotationConfigApplicationContext(ApplicationConfiguration.class));
	}

	private static void test(AnnotationConfigApplicationContext context) {
	    DemoManager  obj = (DemoManager) context.getBean("demoService");
	   System.out.println( obj);
	   // DemoManager  obj2 = (DemoManager) context.getBean("demoManager2");
	   // System.out.println( obj2);
		/*
		 * DemoManager obj3 = (DemoManager) context.getBean("demoService2");
		 * System.out.println( obj3);
		 */
		//DependencyInjection  obj2 = (DependencyInjection) context.getBean("dependencyInjection");
		//obj2.display();
	}
}
