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
//public class Cast implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String Name;
//	private String link;
//	@ManyToMany
//	private Set<? extends Entertain> entertainList = new HashSet<>();
//
//	public Cast() {
//
//	}
//
//	public Cast(int id, String name, String link, Set<? extends Entertain> entertainList) {
//		super();
//		this.id = id;
//		Name = name;
//		this.link = link;
//		this.entertainList = entertainList;
//	}
//
//	public String getName() {
//		return Name;
//	}
//
//	public void setName(String name) {
//		Name = name;
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
//	
//	public Set<? extends Entertain> getEntertainList() {
//		return entertainList;
//	}
//
//	public void setEntertainList(Set<? extends Entertain> entertainList) {
//		this.entertainList = entertainList;
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
//	@Override
//	public String toString() {
//		return "Cast [id=" + id + ", Name=" + Name + ", link=" + link + ", entertainList=" + entertainList + "]";
//	}
//
//	
//	
//}
