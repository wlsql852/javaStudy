package com.java.quiz;

public class Product {
	public String name;
	public int price;
	public String Category;
	public int id;
	public String date;
	public float rate;
	
	public Product setName (String name){this.name = name; return this;}
	public Product setprice (int price){this.price = price; return this;}
	public Product setCategory (String Category){this.Category = Category; return this;}
	public Product setid (int id){this.id = id; return this;}
	public Product setdate (String date){this.date = date; return this;}
	public Product setrate (float rate){this.rate = rate; return this;}
	
	public String getname (){return this.name;}
	public int getprice () {return this.price;}
	public String getCategory(){return this.Category;}
	public int getid () {return this.id;}
	public String getdate (){return this.date;}
	public float getrate () {return this.rate;}
	
	public Product printId (){System.out.println(this.id); return this;}
	public Product printName (){System.out.println(this.name); return this;}
	public Product printCategory (){System.out.println(this.Category); return this;}
	public Product printPrice (){System.out.println(this.price); return this;}
	public Product printDate (){System.out.println(this.date); return this;}
	public Product printRate (){System.out.println(this.rate); return this;}
	
	//메소드를 만들때 해당 메서드가 알수 없는 개수의 매개변수가 필요할 때가 있다.
	//가변 매개변수(가변인자) : 매개변수의 최대 개수를 알지 못해도 동작하는 매개변수 기능
	//자료형... 변수이륾 -> 가변인자
	//가변 매개변수의 동작원리 -> 
	public Product Print(String... temp) {
		//temp 위치 이후에 오는 모든 매개변수를 배여로해서 위 위치에 넣는다.
		//["",""]  //반복문도 가능
		for(String t : temp) {
			System.out.println(t);
		}
//		System.out.print(temp);
		return this;
	}
	
	public Product Space(int count) {
		for(int i = 0; i < count; i++) System.out.print(" ");
		return this;
	}
	public Product Space() {
		System.out.print(" ");
		return this;
	}
	public Product Enter() {
		System.out.print(" ");
		return this;
	}
}
