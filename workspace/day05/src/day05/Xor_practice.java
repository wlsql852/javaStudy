package day05;

public class Xor_practice {

	public static void main(String[] args) {
		int a = 15;
		int b = 5;
		
		//비트 논리 연산자
		System.out.println(a%b);
		System.out.println(a|b);
		System.out.println(a^b);

		System.out.println(~b);   //1010(2)
		// 비트 쉬프트 연산자
		System.out.println(a>>2);
		System.out.println(b<<4);
	}

}
