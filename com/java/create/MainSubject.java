package com.java.create;

import com.java.training.*;

public class MainSubject {

	public static void main(String[] args) {
		/* 객체지향코드 -> 객체
		 * 인스턴스의 정보를 처리하는 작업을 편리하게 해결 필요 => 메소드
		 * 영화정보를 받는다는건 이를 이요하는 무언가의 작업이 있을 예정이다.
		 * 비동기 작업 : 다른사람과 내가 작업을 따로 그리고 동시에 하는 것
		 * 동시에 하고 있던 상대방이 내가 값을 세팅하기 전의 의미없는 변수를 가져감 -> 변수를 생성하면서 값을 넣어주는 작업이 필요
		   -> 인스턴스가 생성되면서 값을 넣어버리자 
		   -> 원래하던 메서드를 이요한 값을 넣는 작업을 생성할 때 자동으로 호출되도록 하는 것
		   => 생성자*/
		
		/*생성자 : 생성될때 자동으로 호출되기 위해서 만들어지는 메서드
		   * 생성자는 자동으로 호출이 가능해야함
		     -> 동작은 일반 메서드와 같지만 이름이 클래스와 동일한 이름이다.
		   * 자동으로 호출된다는 것은 호출되는 지점을 지정하지 않음 -> 반환을 안함 -> 반환타입을 적지 않음
		   * 매개변수는 어떻게 넣는가? -> 생성자는 메서드에 매개변수를 넘길 방법이 없다. 
		     -> 생성될 때 값을 넘김 
		   * 오버로딩이 가능*/
		
		/*생성자 주의사항 - 생성자의 특별한 위치때문
		   *자동 호출 -> 내 의사와는 상관없이 무조건 호출하는 것
		            -> 아무것도 안넣어도 생성자가 호출됨
		   *내가 만든적이 없어도 생성될때가 있음.
		   *그렇다면 어떤 인스턴스를 생성할때 생성자를 신경쓰고 싶지 않을때-> 자동으로 생성자를 만들어준다면 내가 신경쓰지 않아도 되겠다.
		    -> 생성자가 아무것도 하지 않고 외형만 존재함을 의미
		    -> 클래스에 생성자를 만들지 않는다면 자동으로 만들어주는 생성자
		    => 디폴트 생성자 - 기본 생성자
		   * 기본 생성자는 내가 생성자를 안만들면 클래스가 인스턴스화를 절때 못하니까 해당 에러를 무시하기 위해 자동으로 추가하는 메서드(생성자
		     -> 기본 생성자를 제외하고 1개라도 생성자가 존재한다면 어찌되었든 인스턴스가 가능한 상태
		     -> 굳이 기본 생성자를 만들어줄 필요가 없음) 
		   * 기본생성자를 무소건 말들어준 다면  기본 생성자를 커스터 마이징은 할 수없다.
		     -> 그래서 생성자가 1개라도 잇우묜 기본 생성자를 제거*/
		
		/*생성자 주의사항-2
		   * 생성자를 쓴다고 해서 생성자에 넣는 정보가 자료형이 바뀌지 않음
		   * 클래스가 가지는 취약점을 똑같이 가짐
		   * 생성자라는 녀석이 자신만의 이름을 가진 메서드라서 일반 메서드가 가진 deepcopy 문제점을 해결할 것 처럼 보이지만 싫은 그렇지 않음
		   * movie class에서 this.name = new String("name");으로 넣어야함 -> 유일성을 지킬 수 있음*/
		
		/*복사생성자
		   : 클래스를 복사하기 위한 용도로 만즐어진 생성자*/
		
		/* 생성자 체이닝
		  : 생성자에서 매개변수가 하나 두개를 생략했을 때도 동작할 수 있도록 하는 것
		   * 생성자의 무분별한 재생성을 막기위한 기능
		   * 여러번 내용을 적지 않고 한개만(가장 많은 매개변수를 가진 생성자) 제대로 만들고 나머지는 연결해서 동작하도록 만들자
		   * this를 이용한 생성자 호출(this 생성자)를 연속으로 하면 된다.*/
		
		/*복사메서드
		   * 내가 제어하는 정보를 위해서 생성자가 어마무시하게 많아지는 경우가 있다.
		   * 예시 - clone, */
		
		//생성자
		Movie mov = new Movie("이름", "장르"); //생성자 예
//		movie.Setting("살인의 추억", "범죄/추리");
//		movie.name = "살인의 추억";
//		movie.category = "범최/추리";
//		Movie a = new Movie();  => 두개의 인자가 들어간 생성자를 만든후의 이 코드는 에러
		
//		String a = new String();
		
		//생성자 주의사항-2 예
		String title = new String("범죄/추리");
		Movie movie = new Movie ("살인의 추리", title, "봉준호", "15세 이상");
		Movie movie2 = new Movie ("살인자의 기억법", title, "봉준호", "15세 이상");
		//살인자의 기억법이 갑자기 미스테리로 바뀐다면?
//		movie2.a category.Change("미스테리");
		System.out.println(movie.category);
		System.out.println(movie2.category);  //둘이 같은 결과가 출력됨 -> 하나가 바뀌면 같이 바뀌는 것을 알수 있음
		
//		Movie movie = new movie("살인의 추억", "범죄/추리", "봉준호", "18세 이상");
		Theater theater1 = new Theater(movie);		
		Theater theater2 = new Theater(movie.setName("살인의 추억(성인용)"));  //제목을 바꿈
		Theater theater3 = new Theater(movie2);  
		theater2.runningMovie.ageLimit = "전체연령가";
		
//		System.out.println(theater1.runningMovie.ageLimit);
//		System.out.println(theater2.runningMovie.ageLimit);
		
//		Movie movie3 = new Movie();
//		movie3.setAgeLimit("18세 이상").set
		
		WheelBuilder wheelBuilder = new WheelBuilder();
		wheelBuilder.setName("일반차량").setInch(32.5f).setGrass(40f);
		
		CarBuilder carBuilder = new CarBuilder();
		//carBuilder   .setWheel(wheelBuilder);
		
		Car a = carBuilder.Generate();
		Car b = carBuilder.setWheel(wheelBuilder.setName("겨울용")).Generate();
		
		
	}

}
