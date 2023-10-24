package day03;

public class DataType {

	public static void main(String[] args) {
		int a = 65;
		float b = a;        //자동형병환
		System.out.println(b);
		
		char c = (char) a;       //강제형변환
		System.out.println(c);

	}

}
