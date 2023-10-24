package com.java.quiz;

import java.util.Scanner;

public class MainSubject {

	public static void main(String[] args) {
//		Product a = new Product();
//		a.setName("사과");
//		a.setCategory("식품");
//		a.setdate ("20231023");
//		a.setid(1);
//		a.setprice(5000);
//		a.setrate(4);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("개수 입력");
		int count = sc.nextInt();  //1
		Product[] products = new Product[count];
		for (int i = 0; i < count; i+=1) products[i] = new Product();
		for (Product product : products) {
			product.Print("=============================").Enter()
			       .Print("ID").Space(5).Print(":").Space()
				   .setid(sc.nextInt())
				   .Print("Category : ")
			       .setCategory(sc.next())
			       .Print("Name : ")
			       .setName(sc.next())
			       .Print("price : ")
			       .setprice(sc.nextInt())
			       .Print("date : ")
			       .setdate(sc.next())
			       .Print("rate : ")
			       .setrate(sc.nextInt());
		}
		
		for (Product product : products) {
			product.printId()
			       .printName()
			       .printCategory()
			       .printPrice()
			       .printDate()
			       .printRate();
		}
		sc.close();
	}

}
