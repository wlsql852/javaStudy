package com.java.training;

public class EngineBuilder {
	public String name;
	public int cylinder;
	public int power;
	
	public EngineBuilder setName(String name) {this.name = name; return this;}
	public EngineBuilder setCylinder(int cylinder) {this.cylinder = cylinder; return this;}
	public EngineBuilder setPower(int power) {this.power = power; return this;}
	
	public Engine Generate() {
		return new Engine()
				.setName(this.name)
				.setCylinder(this.inch)
				.setPower(this.grass);
	}
}
