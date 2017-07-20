package com.imk.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 **  Hold properties files
 *	@ConfigurationProperties("basic")
 *	"basic" : indicate the prefix used in properties file
 *			* Exmple: basic.name = aaaaa
 */

@Component	
@ConfigurationProperties("basic")
public class BasicConfiguration {
	
	private boolean activeConfig ;
	private int portNumber;
 
	
	
	
	
	
	
	
	
	public boolean isActiveConfig() {
		return activeConfig;
	}
	public void setActiveConfig(boolean activeConfig) {
		this.activeConfig = activeConfig;
	}
	public int getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}
	 
	
	
	
	
	
	

}
