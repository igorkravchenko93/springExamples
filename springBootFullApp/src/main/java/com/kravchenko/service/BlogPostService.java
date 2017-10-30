package com.kravchenko.service;

import com.kravchenko.model.BlogPost;

public interface BlogPostService {

    void createPost(String author, String message);

    Iterable<BlogPost> getAllPosts();

    void createBlog();
}
