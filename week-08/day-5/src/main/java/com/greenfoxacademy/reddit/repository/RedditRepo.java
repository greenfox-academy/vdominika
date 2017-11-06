package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedditRepo extends CrudRepository <Post, Long> {
    List<Post> findAllByOrderByScoreDesc();
}
