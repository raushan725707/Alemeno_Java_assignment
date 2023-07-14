package com.alemeno.springbootproj.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alemeno.springbootproj.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {

//	Optional<Tweet> findByUserId(int userid);

}
