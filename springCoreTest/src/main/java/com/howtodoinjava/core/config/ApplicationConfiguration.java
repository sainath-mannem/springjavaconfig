package com.howtodoinjava.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.howtodoinjava.core.beans.DemoManager;
import com.howtodoinjava.core.beans.DemoManagerImpl;
import com.howtodoinjava.core.beans.DependencyInjection;

@Configuration
@ComponentScan(basePackages = "com.howtodoinjava.core.config.spring")
public class ApplicationConfiguration {
	
	@Bean
	@Scope("prototype")
    public DemoManager demoService() {
        return new DemoManagerImpl(2);
    }
	
	/*
	 * @Bean public DemoManager demoService2() { return new DemoManagerImpl2(); }
	 */
	@Bean
	@Scope("prototype")
	public DependencyInjection dependencyInjection() {
		return new DependencyInjection();
	}

}
