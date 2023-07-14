package com.alemeno.springbootproj.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.alemeno.springbootproj.entity.Tweet;
import com.alemeno.springbootproj.entity.User;
import com.alemeno.springbootproj.repo.TweetRepository;
import com.alemeno.springbootproj.repo.UserRepository;

@Service
public class ServiceClass {
@Autowired
private UserRepository userRepository;
@Autowired
private TweetRepository tweetRepository;

public User saveuser(User user) {
	return userRepository.save(user);
}

public Tweet createTweet(Tweet tweet) {
return	tweetRepository.save(tweet);
}

public User getAllTweetOfUser(int userid) {
	
User	u=userRepository.findById(userid).orElseThrow();
//return	(List<Tweet>) userRepository.findById(userid).orElseThrow();
return u;
}

public Tweet getTweetById(int tid) {
	return tweetRepository.findById(tid).orElseThrow();
}
public Tweet updateTweet(int  tid) {
	Tweet tweet= tweetRepository.findById(tid).orElseThrow();
return	tweetRepository.save(tweet);
}

public String deleteTweet(int  tid) {
tweetRepository.deleteById(tid);
return "Tweet deleted by id "+tid;
}

}
