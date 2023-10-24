package com.java.training;

public class Car {
	public String name;
	public float weight;
	public Wheel wheel;
	public Car setName(String name) {this.name = name; return this;}
	public Car setWeight(float weight) {this.weight = weight; return this;}
	public Car setWheel(Wheel wheel) {this.wheel = wheel; return this;}
}
