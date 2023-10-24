package day06;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("신호등 프로그램");
		System.out.println("신호를 입력하세요");
		System.out.println("빨간불 : 1, 초록불 : 2");
		//System.out.println("빨간불 : 1, 초록불 : 2, 노란불 : 3");
		System.out.print("신호 입력 : ");
		int sign = sc.nextInt();
		String result;
		result = (sign==1)?"정지하세요":"출발하세요";
		//result = (sign==1)?"정지하세요":sign == 2?"출발하세요":"서행하세요";
		System.out.println(result);
		sc.close();
	}

}
