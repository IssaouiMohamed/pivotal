package com.imk.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imk.demo.config.BasicConfiguration;



@RestController
public class ConfigController {
	
	@Autowired
	private BasicConfiguration configuration;
	
	@GetMapping("getConfig")
	public Map<String, Object> getConfig() {
		Map<String, Object> map = new HashMap<>();
		map.put("port number", configuration.getPortNumber());
		map.put("activate config", configuration.isActiveConfig());
		
		return map;

	}

}
