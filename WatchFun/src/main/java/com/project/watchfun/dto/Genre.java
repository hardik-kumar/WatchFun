//package com.project.watchfun.dto;
//
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Genre implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String name;
//	@ManyToMany(mappedBy="genre")
//	private Set<Entertain> entertainSet = new HashSet<>();
//	
//	@ManyToMany
//	private Set<Movie> movieSet;
//	@ManyToMany
//	private Set<TVSeries> tvSeriesSet;
//	@ManyToMany
//	private Set<Novel> novelSet;
//	
//	public Genre() {
//		
//	}
//	
//	public Genre(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//}
