package com.java.training;

import com.java.create.*;

public class Training {
	public Movie movie;
	public Theater theater;
	
//	public static void run(Movie movie, Theater theater) {
//		System.out.println("영화제목 : " + movie.name);
//		System.out.println("영화장르 : " + movie.category);
//		System.out.println("영화감독 : " + movie.producer);
//		System.out.println("영화연령제한 : " + movie.ageLimit);
//	}
	public static void run() {
//		Movie[] movies = new Movie[6];
//		for (int i = 0; i < movies.length; i++) movies[i] = new Movie();
//		movies[0].setAgeLimit("18세 이상").setName("살인의 추억").setCategory("범죄/추리").setProducer("봉준호");
//		movies[1].setAgeLimit("18세 이상").setName("기생충").setCategory("미스테리").setProducer("봉준호");
//		movies[2].setAgeLimit("전체이용가").setName("뽀로로 극장판").setCategory("어린이").setProducer("EBS");
//		movies[3].setAgeLimit("전체이용가").setName("뽀로로 극장판2").setCategory("어린이").setProducer("EBS");
//		movies[4].setAgeLimit("12세 이상").setName("명탐정코난 극장판").setCategory("범죄/추리").setProducer("일본인");
//		movies[5].setAgeLimit("12세 이상").setName("명탐정코난 극장판2").setCategory("범죄/추리").setProducer("일본인");
//		
//		Theater theater1 = new Theater(movies[0], movies[1]);
//		Theater theater2 = new Theater(movies[1], movies[2]);
//		
//		theater1.ShowMovieIndex();
//		theater2.ShowMovieIndex();
//		
		//비슷한 정보 또는 동일한 정보를 가진 인스턴스들을 많이 만들고 이용해야 할때
		//그걸 매번 작성하기 보다 좀 더 편리하게 만드는 방식 -> 메서드 체이닝을 활용한 Builder Pattern
		//중간자에게 정보를 넘겨야할때 똑같은 애를 여러개 만들 수 있음
		
		//비슷한 정보를 가진 영화를 여러개 만든다
		//-> A영화를 복사에서 B영화를 만들고 B영화에서 변화한 부분만 수정   //잘못된 정보를 넣었을 경우가 많고 에러가 난것을 개발자가 알 수 없음 -> builder pattern
		
		Movie[] movies = new Moive[6];
		MovieBuilder builder = new MovieBuilder();
		builder.setName("살인의 추억").setCategory("범죄/추리").setAgeLimit("17세 이상").setProducer("봉준호");
		movies[0] = builder.Generate();
		movies[1] = builder.setCategory("미스테리").setName("기생충").Generate();
		
		
 	}
}
