package day04;

public class Equality_sign_operator {

	public static void main(String[] args) {
		double a = 3.14;
		double b = 5.15;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String c1 = "hello World!";
		System.out.println(c1.equals("hello World!"));  //문자열은 비교시 .equal()사용, 대소문자 구분
	}

}
