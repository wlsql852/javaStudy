package com.java.project;

import java.util.Scanner;
import com.java.unique.*;
import com.java.product.*;

public class MainSubject {
	public static void main(String[] args) { 
	/*객체지향 프로그래밍<-> 절차적 프로그래밍
	   * 객레지향 : 유지보수가 쉬움 , 개발 어려움
	   * 절차적 : 개발 쉬움, 유지보수가 어려움
	   * 지금까지 배운것은 객체지향과는 관련이 없는것
	       -> 객체지향의 중요 요소 : class*/
	
	/* 관계란 서로 연관성이 없는 변수(정보)를 연관성을 주는게 아니라 연관성이 있는 변수(정보)를 서로 연결하는 것
	   *게시판 아이디와 비밀번호를 모두 변수처리하면 변수가 너무 많아지기 때문에 그들을 묶어 배열로 만듬
	     -> 그러나 아이디와 비밀번호뿐만 아니라 이름, 주소등 여러 속성들이 많은데 이들을 어떻게 할것인가?
	   * 서로 연관성이 있는 정보를 따로 관리한다면 문제가 생길 수 있다.
	     -> 연관성이 있는 정보를 묶어서 관리하자!
	     //String user1 = new String[2];   //아이디와 비밀번호
	       String user2 = new String[2];
	       
	   * 이 방법은 생년월일이나 글 수 같은 다른 유형의 정보는 묶을 수 없다.
	     -> 서로 다른 자료형도 묶어주기 위해 "객체"를 발명
	     -> 객체 = 참조 자료형
	            == class*/
		
	/*class  - 클래스 만들기
	   *public     //공개하겠다
	   *class      //객체
	   *NewObject  //객체명
	   *{}         //이 객체가 어떻게 생겼는지 설명하는 설명서, 이 객체가 어떤 정보를 가지고 있는지 알려주는 코드
	   *int data; float fdata; double ddata; 등 변수 선언
	     -> 훗날 다른 클래스에서 이 객체의 정보를 가져올 때 변수를 이용 ex) java.lang.util.Scanner
	   *객체를 이용해 생성하는 작업 : new 이용 -> 인스턴스 생성*/
	
	/*인스턴스 내부에 있는 정보에 접근하는 방법
	   *인스턴스명 -> 참조자료형 변수명 + .
	   *. : 해당 잠조자료형 내부에 접근해라    ex)a.data = 5;*/
		
	/* 멤버 : 클래스 내부에 작성한 변수
	   * 멤버들은 누구에게 속해있는가 -> 인스턴스
	   * 클래스와 인스턴스를 쓰다보면 생기는 불편함
	   * 인스턴스에 속해있지 않고 클래스 자체에 속해있는 멤버 
	     -> 정적멤버(static member)
	     : new를 통해서 만들어낸 인스턴스에 속해있지 않고 클래스 자체에 속한 멤버 
	   * 단순하게 멤버를 스태틱 멤버로 변경가능 : int data2 -> static int data2;*/
		
	/*멤버 변수 이름의 지켜야 할 규칙
	   1. 멤버 변수 이름은 무조건 소문자여야함, 가능한 _는 안쓴느게 좋음
	   2. 다른 패캐지에서 가져올 때는 import나 해당 패키지이름을 적어 불러옴*/
		
	/*접근제한자 : 쓸수 있는 범위를 정해놓은 것  public, portected, private, default
	   * default : 기본(작성하지 않으면), 자료형 앞에 안적으면 자동을 default생성, 같은 패키지 내부에서만 접근이 가능하다.
	     -> 다른 클래스에서 멤버를 생성할 때는 내가 해당 멤버를 공개할 범위도 적어줘야함(보통은 public)
	     
	   * 그헣다면 내가 정적 멤버를 쓸때 무조건 인스턴스를 통해야하는가?
	   * 정적 멤벋르은 어차피 인스턴스가 아닌 클래스에 속해있으므로 클래스 자체를 통해 접근할 수 있다.*/ 
		com.java.instance.Inst a = new com.java.instance.Inst();
		a.id = new String("ABCD");
		a.pw = new String("1234");  //생성은 되는데 접근이 안됨-> 다른 패키지에 있으니까 안되는 것 -> 접근 제한자 수정
		
		// com.java.instance.Inst.usercount = 5;
		com.java.instance.Inst[] users = new com.java.instance.Inst[10];
		for(com.java.instance.Inst user : users) {
			user.id = new String("ABCD");
			user.pw = new String("1234");
			com.java.instance.Inst.usercount +=1;	
		}
		
		/*특정클래스는 누구도 접근하지 않았으면 할 때(외부의 사람이 아닌 공동 개발시 같은 개발자가 못보게 하는 법)
		  - 내가 엉터리 코드를 만들었을 때 다른 사람이 보고 가져다 쓰면 그 사람이 만든 코드는 문제가 없지만 돌아가지 않음
		  -> 공개 클래스와 비공개 클래스
		   
		  *공개 클래스의 특징
		    1. 공개 클래스는 해당 크래스가 적힌 파일과 파일명이 동일해야한다.
		    2. 하나의 파일에는 하나의 공개클래스만 존재한다. (비공개에는 여러 클래스가 들어갈 수 있음) 
		    3. 한개의 파일에는 한개의 공개클래스와 0~N개의 비공개 클래스가 존재한다. 
		    
		  * 비공개 클래스 만드는 법
		    : class앞에 접근 제한자를 public을 제외한 private, protected, default(공란)을 쓰면 된다.
		    //단, 비공개 클래스는 같은 패키지에서만 공개 클래스가 돤다.
		     
		  * 그러나 사실 잘 안씀 - 내가 어떤 정보의 관계를 가진 묶음(클래스)를 만들었다면 그걸 나만 써야할 이유가 없음(오류 개선이 아닌이상)  */
		
		/*내가 멤버(정적이든 아니든) 변수에 처음 만들자마자 특정 값을 넣어주고 싶다.
		   -> 클래스 멤버 변수 값 할당 (초기화기법)
		   ex) String gender = "여" //만약 여기에 추가로 값이 넣지 않으면 무조건 "여"가 넣어짐*/
		
		/*해당 참조형 변수(인스턴스)가 내부에 가지고 있는 정보는 모두 유일한가?
		   ->두개의 인스턴스가 있을 때 인스턴스 안의 참조형 변수가 같은 주소를 가리킬 수 있음(참조형 변수의 중복 문제)
		   *내가 한개를 여러개로 관리하고 싶을 때는 그럴수도 잇음
		     ex) 상품은 하나지만 2명의 Buyer class(구매자정보)가 있을ㄹ때 Product(상품정보) class 둘다 들어가기 때문에 만약 상품 정보가 바뀌었을때 구매자정보가 자동으로 바뀜*/
		
		/*반대로 하나의 참조형 변수가 무엇도 가리키지 않는다면? -> 주소를 만들고 거기에 값을 넣어주지 않을 수 있다.
		 * 비어있음 -> null*/
		
		/**/
		Scanner sc = new Scanner(System.in);
		com.java.user.User[] iusers = new com.java.user.User[10];  //인스턴스 10개를 만들어줘야함
		for(int i = 0; i <iusers.length; i++) iusers[i] = new com.java.user.User();
		for (com.java.user.User user : iusers) {
			user.id = sc.next();
			user.pw = sc.next();
			user.birth = sc.next();
			user.gender = sc.next();	//남, 여
			//user.regist = sc.next();
			//String temp = new String("1");
			//if (temp.equals(user.regist.charAt(7)))
		}
		sc.close();
		System.out.println("===============남성==============");
		for(com.java.user.User user : iusers) {
			if(user.gender.equals("남")) {
				System.out.printf("%s|%s|%s|%s\n",user.id,user.pw,user.birth,user.gender);
			}
		}
		System.out.println("===============여성==============");
		for(com.java.user.User user : iusers) {
			if(user.gender.equals("여")) {
				System.out.printf("%s|%s|%s|%s\n",user.id,user.pw,user.birth,user.gender);
			}
		}
		
		Unique aa = new Unique();
		Unique bb = new Unique();
		aa.item = new UniqueItem();  
		//bb.item = new UniqueItem();  
		bb.item = aa.item;  //둘이 동일한 주소를 가르키게 됨 
		aa.item.data = 5;    //가르킨 주소의 값이 5로 바뀜
		bb.item.data = 3;    //가르킨 주소의 값이 3로 바뀜
		System.out.println(aa.item.data);  //3이 나옴
		System.out.println(bb.item.data);  //3이 나옴  -> 새로 주소를 정해줘야함
		
		
		//만약 새 참조형을 만들기 위함
		// String c; c.clone;
		
		Buyer buyer1 = new Buyer();
		Buyer buyer2 = new Buyer();
		buyer1.name = "홍길동";
		buyer2.name = "임꺽정";		
		buyer1.product = new Product();
		buyer2.product = buyer1.product;
		buyer2.product.name = new String("apple");
		buyer2.product.price = 5000;
		
		System.out.printf("%s님이 구매한 상품 %s는 %d원입니다.\n", buyer1.name, buyer1.product.name, buyer1.product.price);
		buyer2.product.price = (buyer2.product.price*3)/2;
		System.out.printf("%s님이 구매한 상품 %s는 %d원입니다.\n", buyer1.name, buyer1.product.name, buyer1.product.price);
		
		Buyer buyer3 = new Buyer();
		
		if(buyer3.product == null) {
			
		}
		
		//필요할때마다 인스턴스를 사용하면서 다중 연결이 가능!
		
		
		// MS 949
		
		
		
		
		
	}
	

}
