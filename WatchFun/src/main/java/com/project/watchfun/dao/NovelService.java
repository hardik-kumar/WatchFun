package com.project.watchfun.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.watchfun.dto.Novel;
import com.project.watchfun.repository.NovelRepository;

@Service
public class NovelService {

	@Autowired
	NovelRepository novelRepository;
	
	public List<Novel> getAllNovels() {
		List<Novel> categories= new ArrayList<>();
	   novelRepository.findAll().forEach(categories::add);
	 return categories;
	}
	
	public String insertNovel() {
		Novel nov= new Novel("id", "name", "img", 20, 20, "language", "downloadLink", "synopsis", 20, "status", "genre", "auteurSet");
		novelRepository.save(nov);
		return "inserted";
	}
}



