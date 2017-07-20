package com.imk.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.imk.demo.model.Car;

@Component
public class WelcomeService {

	// Get welcome.message from properties file
	@Value("${welcome.message}")
	private String welcomeMessage;

	public List<Car> getCarList() {
		List<Car> list = new ArrayList();
		list.add(new Car(123, "bmw"));
		list.add(new Car(567, "isuzu"));
		list.add(new Car(897, "toyota"));
		return list;
	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

}
