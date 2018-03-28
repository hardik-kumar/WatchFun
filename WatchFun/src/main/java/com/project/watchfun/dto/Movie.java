package com.project.watchfun.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Movie extends Entertain implements Serializable{

//	@ManyToMany(mappedBy="entertainList")
//	private Set<Cast> castList = new HashSet<>();
//	
//	private static final long serialVersionUID = 1L;
//	@ManyToMany(mappedBy="movieSet")
//	private Set<Auteur> auteurSet = new HashSet<>();
//	
//	@ManyToMany(mappedBy="movieSet")
//	private Set<Genre> genre;
	
	
	@Id
	private String id;
	private String castList;
	private String auteurSet;
	private String genre;
	
	public Movie() {
		super();
	}

	


	public Movie(String name,String img,double rating, double price) {
		super.name=name;
		super.img=img;
		super.rating=rating;
		super.price=price;
	}




	public Movie(String id,String name, String img, double rating, double price, String language, String downloadLink,
			String synopsis, double size, String status,String castList,String auteurSet, String genre) {
		super(name, img, rating, price, language, downloadLink, synopsis, size, status);
		this.id=id;
		this.castList= castList;
		this.auteurSet=auteurSet;
		this.genre=genre;
		
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getCastList() {
		return castList;
	}




	public void setCastList(String castList) {
		this.castList = castList;
	}




	public String getAuteurSet() {
		return auteurSet;
	}




	public void setAuteurSet(String auteurSet) {
		this.auteurSet = auteurSet;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	@Override
	public String toString() {
		return "Movie [id=" + id + ", castList=" + castList + ", auteurSet=" + auteurSet + ", genre=" + genre + "]";
	}

	
}
