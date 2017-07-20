package com.imk.demo.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


/**
 * 
 * @author issaoumo
 * 
 * This class used to make some configuration (exp: cashing , pool ...)
 * Only for "dev"  environment
 * 
 * We can make the same for "prod" environment
 *
 */
		
@Component
@Profile("dev")      // for "dev" environment cnfigured in application.properties
public class DevEnvironmenttOnlyConfig {
	
/*	
	@Bean
	public ConfigurableEmbeddedServletContainer  doSomeConfigFoedev(ConfigurableEmbeddedServletContainer container) {
		container.setContextPath("/spring-boot-dev");
		container.setPort(8484);
		container.setDisplayName("get name from DevEnvironmenttOnlyConfig.java");
		return container;
		 
	}
	*/

}
