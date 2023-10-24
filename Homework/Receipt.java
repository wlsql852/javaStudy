package com.java.Homework;

public class Receipt {

	public static void main(String[] args) {
		Product pro1 = new Product();
		Product pro2 = new Product();
		Product pro3 = new Product();
		Product pro4 = new Product();
		pro1.name = new String("사과");
		pro1.price = 5000;
		pro2.name = new String("포도");
		pro2.price = 7000;
		pro3.name = new String("딸기");
		pro3.price = 3000;
		pro4.name = new String("배");
		pro4.price = 6000;
		
		Consumer con1 = new Consumer();
		Consumer con2 = new Consumer();
		Consumer con3 = new Consumer();
		Consumer con4 = new Consumer();
		con1.name = "홍길동";
		con1.product  = new Product();
		con1.product.name = pro1.name;
		con1.count = 3;
		
		con2.name = "임꺽정";
		con2.product  = new Product();
		con2.product.name = pro2.name;
		con2.count = 1;
		
		con3.name = "세종";
		con3.product  = new Product();
		con3.product.name = pro3.name;
		con3.count = 2;
		
		con4.name = "허난설헌";
		con4.product  = new Product();
		con4.product.name = pro4.name;
		con4.count = 4;
		
		System.out.println("===============영수증================");
		System.out.println("성함 : " + con1.name);
		System.out.println("총액 : " + con1.product.price * con1.count);
		System.out.println("====================================");
		
		
		
		
		
		
	}

}
