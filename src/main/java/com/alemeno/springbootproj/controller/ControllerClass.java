package com.alemeno.springbootproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alemeno.springbootproj.Service.ServiceClass;
import com.alemeno.springbootproj.entity.Tweet;
import com.alemeno.springbootproj.entity.User;

@RestController
@RequestMapping("/api")
public class ControllerClass {

	@Autowired
	private ServiceClass serviceClass;
	
	@PostMapping("/saveUser")
	ResponseEntity<?> createUser(@RequestBody User user){
		return new ResponseEntity<>(serviceClass.saveuser(user), HttpStatus.OK);
	}
	
	@PostMapping("createTweet")
	ResponseEntity<?> saveTweet(@RequestBody Tweet tweet){
		return new ResponseEntity<>(serviceClass.createTweet(tweet), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/tweetbyuserid/{uid}")
	ResponseEntity<?> getTweetByUserId(@PathVariable int uid){
User tweet=		serviceClass.getAllTweetOfUser(uid);
		return new ResponseEntity<>(tweet, HttpStatus.OK);
	}
	
	@GetMapping("/gettweet/{tid}")
	ResponseEntity<?> getTweetById(@PathVariable int tid){
	return new	ResponseEntity<>(serviceClass.getTweetById(tid), HttpStatus.OK);
	}
	
	@PutMapping("/updatetweet/{tid}")
	ResponseEntity<?> updateTweet(@PathVariable int tid) throws Exception{
		if(serviceClass.getTweetById(tid) != null) {
		return new ResponseEntity<>(serviceClass.updateTweet(tid), HttpStatus.ACCEPTED);}
		else
			throw new Exception("no such element present");
	}
	@DeleteMapping("/delete/{tid}")
	ResponseEntity<?> deleteTweet(@PathVariable int tid){
		serviceClass.deleteTweet(tid);
		return new ResponseEntity<>("Tweet deleted by id "+tid, HttpStatus.OK);
	}
	
	
}
