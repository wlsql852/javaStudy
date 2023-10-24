package com.java.create;

public class MovieBuilder {
	public String name;
	public String category;
	public String producer;
	public String ageLimit;

//	public Movie(Movie other) {                                             //복사생성자, 생성자체이닝
//		this(other.name, other.category,other.producer,other.ageLimit);
//	}
		
	public MovieBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public MovieBuilder setCategory(String category) {
		this.category = category;
		return this;
	}
	public MovieBuilder setProducer(String producer) {
		this.producer = producer;
		return this;
	}
	public MovieBuilder setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
		return this;
	}
	
	public Movie Generate() {
		return new Movie().setName(this.name).setCategory(this.category).setProducer(this.producer).setAgeLimit(this.ageLimit);
	}
}
