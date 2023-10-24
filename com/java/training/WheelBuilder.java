package com.java.training;

public class WheelBuilder {
	public String name;
	public float inch;
	public float grass;
	public WheelBuilder setName(String name) {this.name = name; return this;}
	public WheelBuilder setInch(float inch) {this.inch = inch; return this;}
	public WheelBuilder setGrass(float grass) {this.grass = grass; return this;}
	
	public Wheel Generate() {
		return new Wheel()
				.setName(this.name)
				.setInch(this.inch)
				.setGrass(this.grass);
	}
}
