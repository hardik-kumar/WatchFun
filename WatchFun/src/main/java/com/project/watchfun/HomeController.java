package com.project.watchfun;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.watchfun.dao.MovieService;
import com.project.watchfun.dao.NovelService;
import com.project.watchfun.dao.TVSeriesService;


@Controller
public class HomeController {

	@Autowired
	private MovieService ms;
	@Autowired
	private NovelService ns;
	@Autowired
	private TVSeriesService ts;
	
	@RequestMapping("/home")
	public String welcome(Map<String, Object> model) {
		
		
		((Model) model).addAttribute("mov", ms.getAllMovies());
		((Model) model).addAttribute("nov", ns.getAllNovels());
		((Model) model).addAttribute("tvs", ts.getAllTVSeries());
		
		

		return "Welcome";
	}

	@RequestMapping("/save1")
	public String save1() {
		return ms.insertMov();
	}
	
	@RequestMapping("/save2")
	public String save2() {
		return ns.insertNovel();
	}
	
	@RequestMapping("/save3")
	public String save3() {
		return ts.insertTVSeries();
	}
	
}


//movieList.add(new Movies("movie1", "latest", "Avengers", "img/portfolio/01-large.jpg", "img/portfolio/01-small.jpg"));
