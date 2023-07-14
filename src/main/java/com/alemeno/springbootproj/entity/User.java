package com.alemeno.springbootproj.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

@OneToMany(mappedBy = "user_information",cascade = CascadeType.ALL )
private List<Tweet> tweets;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Tweet> getTweet() {
	return tweets;
}
public void setTweet(List<Tweet> tweet) {
	this.tweets = tweet;
}

}
