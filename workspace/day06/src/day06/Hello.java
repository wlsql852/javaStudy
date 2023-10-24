package day06;

public class Hello {

	public static void main(String[] args) {
		String s = "hello";
		int i = 3;
		System.out.println(s instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer);  
		//그외 : Float, Double, Character 등
	}

}
