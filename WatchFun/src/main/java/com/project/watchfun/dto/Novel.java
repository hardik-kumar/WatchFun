package com.project.watchfun.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Novel extends Entertain implements Serializable{

	private static final long serialVersionUID = 1L;
//	
//	@ManyToMany(mappedBy="novelSet")
//	private Set<Genre> genre;
//	
//	@ManyToMany(mappedBy="novelSet")
//	private Set<Auteur> auteurSet = new HashSet<>();

	@Id
	private String id;
	private String genre;
	private String auteurSet;
	
	public Novel(String id, String name, String img, double rating, double price, String language, String downloadLink,
			String synopsis, double size, String status,String genre, String auteurSet) {
		super(name, img, rating, price, language, downloadLink, synopsis, size, status);
		this.id=id;
		this.genre=genre;
		this.auteurSet=auteurSet;
	}





	public Novel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Novel(String name,String img,double rating, double price) {
		super.name=name;
		super.img=img;
		super.rating=rating;
		super.price=price;
	}





	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getGenre() {
		return genre;
	}





	public void setGenre(String genre) {
		this.genre = genre;
	}





	public String getAuteurSet() {
		return auteurSet;
	}





	public void setAuteurSet(String auteurSet) {
		this.auteurSet = auteurSet;
	}





	@Override
	public String toString() {
		return "Novel [id=" + id + ", genre=" + genre + ", auteurSet=" + auteurSet + "]";
	}

	
	
}
	
