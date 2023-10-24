package com.java.create;

public class Theater {
	public Movie runningMovie[] = new Movie[2];
	public Theater(Movie runningmovie1, Movie runningmovie2) {
//		this.runningMovie = new Movie(runningMovie.name, runningMovie.category, runningMovie.producer, runningMovie.ageLimit); 
//		this.runningMovie = new Movie(runningMovie);//복사 생성자
//		this.runningMovie = new Movie.clone();
		this.runningMovie[0] = runningmovie1.clone();
		this.runningMovie[1] = runningmovie2.clone();
	}
	
	public int movieIndex = 0;
	public Theater NextMovie(Movie movie) {
		runningMovie[movieIndex] = movie.clone();
		movieIndex +=1;
		if(movieIndex == runningMovie.length) {}
	}
	
	public void ShowMovieIndex() {
		for (Movie movie : runningMovie) {
			System.out.printf("영화이름 : %s\n", movie.name);
			System.out.printf("영화장르 : %s\n", movie.category);
			System.out.printf("영화감독 : %s\n", movie.producer);
			System.out.printf("영화연령제한 : %s\n", movie.ageLimit);
		}
	}

}
