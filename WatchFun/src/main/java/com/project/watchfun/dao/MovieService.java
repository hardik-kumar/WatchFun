package com.project.watchfun.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.watchfun.dto.Movie;
import com.project.watchfun.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		List<Movie> movieList= new ArrayList<>();
		movieRepository.findAll().forEach(movieList::add);
		return movieList;
		
	}
//	
//	public List<Movie> getMovieByGenre(int id){
//		List<Movie> movieList= new ArrayList<>();
//		movieRepository.findByGenreId(id);
//		return movieList;
//	}
	
	public String insertMov() {
		Movie m= new Movie("id", "name", "img", 20, 20, "language", "downloadLink", "synopsis", 20, "status", "castList", "auteurSet", "genre");
		movieRepository.save(m);
		return "inserterd";
	}
}


//public String insertCategory() {
//Category category=new Category("120","12","123");
//categoryRepo.save(category);
//return "inserted";
//}