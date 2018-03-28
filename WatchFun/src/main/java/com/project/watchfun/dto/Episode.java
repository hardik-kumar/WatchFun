//package com.project.watchfun.dto;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Episode implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String link;
//	@ManyToOne
//	private Season season;
//	
//	public Episode() {
//		
//	}
//
//	public Episode(int id, String link, Season season) {
//		super();
//		this.id = id;
//		this.link = link;
//		this.season = season;
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
//	public String getLink() {
//		return link;
//	}
//
//	public void setLink(String link) {
//		this.link = link;
//	}
//
//	public Season getSeason() {
//		return season;
//	}
//
//	public void setSeason(Season season) {
//		this.season = season;
//	}
//
//	@Override
//	public String toString() {
//		return "Episode [id=" + id + ", link=" + link + ", season=" + season + "]";
//	}
//	
//}
