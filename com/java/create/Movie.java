package com.java.create;

public class Movie {
	public String name;
	public String category;
	public String producer;
	public String ageLimit;
	
	public void Setting(String name, String category) {
		this.name = name;
		this.category = category;
		
	}
	
//	//프로그램에서 해당 클래스의 생성자를 자동으로 호출-> 클래슴와 이름이 같아야함, 반환타입x
	public Movie(String name, String category) {
		this.name = name;
		this.category = category;
	}
//	
////	public Movie(String name) {
////		this.name = name;
////	}
//	
//	public Movie() {
//		this("무제");
//	}
//	public Movie(String name) {
//		this(name, "알 수 없음");
//	}
	public Movie(String name, String category, String producer, String ageLimit) {
		this.name = name;
		this.category = category;
		this.producer = producer;
		this.ageLimit = ageLimit;
	}
//	
//	public Movie (String name, String category) {
//		this(name, category, "알수 없음");
//	}
//	public Movie(String name, String category, String producer) {  //생성자 체이닝
////		this.name = name;
////		this.category = category;
////		this.producer = producer;
////		this.ageLimit = "전체연령가";
//		this(name, category, producer, "전체이용가");
//	}
//	
////	public Movie() {}// 기본 생성자
//	
////	Movie a = new Movie();  //그렇다면 어떤 인스턴스를 생성할때 생성자를 신경쓰고 싶지 않을때
//	
	//복사생성자
	public Movie(Movie other) {
		this.name = other.name;
		this.category = other.category;
		this.producer = other.producer;
		this.ageLimit = other.ageLimit;
	}
//	public Movie(Movie other) {                                             //복사생성자, 생성자체이닝
//		this(other.name, other.category,other.producer,other.ageLimit);
//	}
		
	public Movie setName(String name) {
		this.name = name;
		return this;
	}
	public Movie setCategory(String category) {
		this.category = category;
		return this;
	}
	public Movie setProducer(String producer) {
		this.producer = producer;
		return this;
	}
	public Movie setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
		return this;
	}
	
//	public Movie clone() {          //인스턴스를 새로 만듬
//		return new Movie().setName(this.name)
//				          .setAgeLimit(this.ageLimit)
//				          .setProducer(this.producer)
//				          .setCategory(this.category);    
//	}
		
}
