package com.greenfoxacademy.reddit.service;


import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void addPost(Post post){
    postRepository.save(post);
  }

  public List<Post> getAllPosts(){
    return postRepository.findAllByOrderByVotes();
  }

  public void upvotePost(int id){
    Post actPost = postRepository.findById(id).get();
    actPost.setVotes((actPost.getVotes()+1));
    postRepository.deleteById(id);
    postRepository.save(actPost);
  }

  public void downvotePost(int id){
    Post actPost = postRepository.findById(id).get();
    actPost.setVotes((actPost.getVotes()-1));
    postRepository.deleteById(id);
    postRepository.save(actPost);
  }
}
