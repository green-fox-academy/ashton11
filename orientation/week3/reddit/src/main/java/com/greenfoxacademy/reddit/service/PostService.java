package com.greenfoxacademy.reddit.service;


import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  public Post getPostById(int id){
    return postRepository.findById(id).get();
  }

  public Post getPostByTitle(String title){
    return postRepository.findByTitle(title);
  }

  public List<Post> getTop10TrendingPosts(){
    return postRepository.findTop10ByOrderByVotes();
  }

  public void upvotePost(Integer id){
    Post actPost = postRepository.findById(id).get();
    int upvotes = actPost.getVotes() + 1;
    actPost.setVotes(upvotes);
    postRepository.save(actPost);
  }

  public void downvotePost(int id){
    Post actPost = postRepository.findById(id).get();
    actPost.setVotes((actPost.getVotes()-1));
    postRepository.deleteById(id);
    postRepository.save(actPost);
  }
}
