package com.project.watchfun.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.watchfun.dto.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {

	//Iterable<Movie> findByGenreId(int id);
}
