package com.kravchenko.service;

import com.kravchenko.model.Blog;
import com.kravchenko.model.BlogPost;
import com.kravchenko.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    private BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @Override
    @Transactional
    public void createPost(String author, String message) {
        BlogPost blogRecord = new BlogPost();
        blogRecord.setAuthor(author);
        blogRecord.setPostText(message);

        blogPostRepository.save(blogRecord);
    }

    @Override
    public Iterable<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    @Transactional
    public void createBlog() {
        Blog blog = new Blog();
        blog.setBlogName("myBlog");

    }
}
