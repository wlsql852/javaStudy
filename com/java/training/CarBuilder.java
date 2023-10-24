package com.java.training;

public class CarBuilder {
	public String name;
	public float weight;
	public WheelBuilder wheelBuilder;
	
	public CarBuilder setName(String name) {this.name = name; return this;}
	public CarBuilder setWeight(float weight) {this.weight = weight; return this;}
	public CarBuilder setWheelBuilder(WheelBuilder wheelBuilder) {this.wheelBuilder = wheelBuilder; return this;}
	
	public Car Generate() {
		return new Car()
				.setName(this.name)
				.setWeight(this.weight)
				.setWheelBuilder(this.wheelBuilder);
	}

}
