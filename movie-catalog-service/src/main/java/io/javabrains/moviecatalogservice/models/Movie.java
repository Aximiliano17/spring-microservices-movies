package io.javabrains.moviecatalogservice.models;

public class Movie {

	private String movieId;
	private String name;
	
	public Movie(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.name = movieName;
	}
	public Movie() {
		
	}
	
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String movieName) {
		this.name = movieName;
	}
}
