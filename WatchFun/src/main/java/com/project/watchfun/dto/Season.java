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
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Season implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String url;
//	private Auteur auteur;
//	@OneToMany(mappedBy="season")
//	private Set<Episode> episodeSet= new HashSet<>();
//	@ManyToOne
//	private TVSeries tvSeries;
//	
//	public Season() {
//		
//	}
//
//	public Season(int id, String url, Auteur auteur,Set<Episode> episodeSet) {
//		super();
//		this.episodeSet=episodeSet;
//		this.id = id;
//		this.url = url;
//		this.auteur = auteur;
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
//	public String getUrl() {
//		return url;
//	}
//
//	public Set<Episode> getEpisodeSet() {
//		return episodeSet;
//	}
//
//	public void setEpisodeSet(Set<Episode> episodeSet) {
//		this.episodeSet = episodeSet;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public Auteur getAuteur() {
//		return auteur;
//	}
//
//	public void setAuteur(Auteur auteur) {
//		this.auteur = auteur;
//	}
//
//	@Override
//	public String toString() {
//		return "Season [id=" + id + ", url=" + url + ", auteur=" + auteur + ", episodeSet=" + episodeSet + "]";
//	}
//
//	
//	
//}
