package com.project.watchfun.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class TVSeries extends Entertain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	@ManyToMany(mappedBy="tvSeriesSet")
//	private Set<Auteur> auteurSet = new HashSet<>();
//
//	@ManyToMany(mappedBy="tvSeriesSet")
//	private Set<Genre> genre;
//	
//	@ManyToMany(mappedBy="entertainList")
//	private Set<Cast> castList = new HashSet<>();
//	@OneToMany(mappedBy="tvSeries")
//	private Set<Season> seasonSet = new HashSet<>();
	@Id
	private String id;
	private String auteurSet;
	private String genre;
	private String castList;
	private String seasonSet;
	
	
	public TVSeries(String id, String name, String img, double rating, double price, String language,
			String downloadLink, String synopsis, double size, String status,String auteurSet,String genre,String castList,String seasonSet) {
		super(name, img, rating, price, language, downloadLink, synopsis, size, status);
		this.id=id;
		this.auteurSet=auteurSet;
		this.genre=genre;
		this.castList=castList;
		this.seasonSet=seasonSet;
	}


	public TVSeries(String name,String img,double rating, double price) {
		super.name=name;
		super.img=img;
		super.rating=rating;
		super.price=price;
	}


	public TVSeries() {
		super();
		// TODO Auto-generated constructor stub
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





	public void setAuteurSet(String auteurSet) {
		this.auteurSet = auteurSet;
	}





	public void setCastList(String castList) {
		this.castList = castList;
	}





	public void setSeasonSet(String seasonSet) {
		this.seasonSet = seasonSet;
	}


	public String getAuteurSet() {
		return auteurSet;
	}


	public String getCastList() {
		return castList;
	}


	public String getSeasonSet() {
		return seasonSet;
	}


	@Override
	public String toString() {
		return "TVSeries [id=" + id + ", auteurSet=" + auteurSet + ", genre=" + genre + ", castList=" + castList
				+ ", seasonSet=" + seasonSet + "]";
	}






	
	
	
	

	
	
}
