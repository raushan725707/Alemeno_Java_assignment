package com.alemeno.springbootproj.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tweet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String content;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_information;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser_information() {
		return user_information;
	}

	public void setUser_information(User user_information) {
		this.user_information = user_information;
	}

	private LocalDateTime timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
