package com.imk.demo.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonPropertyOrder
public class Car {
	
	private int id;
	private String brand;
	
	
	public Car(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	
	public Car() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + "]";
	}
	
	

}
