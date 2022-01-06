package com.bricolage.demo.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Offre {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private User user;
	
	
	@OneToMany(mappedBy = "offre" , cascade = CascadeType.REMOVE)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<Postule> postules = new ArrayList<>();
	
	private String jobName;
	private String contents;
	private LocalDate date;
	
	
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offre( User user, String jobName, String contents, LocalDate date) {
		super();
		this.user = user;
		this.jobName = jobName;
		this.contents = contents;
		this.date = date;
	}
	
	@JsonIgnore
	public List<Postule> getPostule() {
		return postules;
	}

	public void setPostule(List<Postule> postule) {
		this.postules = postule;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
		
}
