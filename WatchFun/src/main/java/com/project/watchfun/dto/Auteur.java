//package com.project.watchfun.dto;
//
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
//public class Auteur {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String name;
//	private String link;
//	
//	@ManyToMany
//	private Set<TVSeries> tvSeriesSet = new HashSet<>();
//	@ManyToMany
//	private Set<Movie> movieSet = new HashSet<>();
//	@ManyToMany
//	private Set<Novel> novelSet = new HashSet<>();
//	public Auteur() {
//		
//	}
//
//	public Auteur(int id, String name, String link) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.link = link;
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
//	public String getLink() {
//		return link;
//	}
//
//	public void setLink(String link) {
//		this.link = link;
//	}
//
//	@Override
//	public String toString() {
//		return "Auteur [id=" + id + ", name=" + name + ", link=" + link + "]";
//	}
//	
//	
//}
