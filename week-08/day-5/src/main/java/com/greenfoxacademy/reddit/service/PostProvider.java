package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostProvider {

    @Autowired
    RedditRepo redditRepo;

    public void upVote (Long id){
        redditRepo.findOne(id).setScore(redditRepo.findOne(id).score+1);
        redditRepo.save(redditRepo.findOne(id));
    }

    public void downVote (Long id){
        redditRepo.findOne(id).setScore(redditRepo.findOne(id).score-1);
        redditRepo.save(redditRepo.findOne(id));
    }

}
