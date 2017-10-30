package com.kravchenko.web;

import com.kravchenko.model.BlogPost;
import com.kravchenko.service.BlogPostService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Igor on 20.09.2017.
 */
@NoArgsConstructor
@RestController
public class TestController {

    @Autowired
    public TestController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @Getter
    @Setter
    private BlogPostService blogPostService;

    @RequestMapping(path = "/blogc")
    public void createBlog(){
        blogPostService.createBlog();
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public void createPost(@RequestParam(defaultValue = "Igor") String author,
                                         @RequestParam(defaultValue = "SomeText") String message) {
        blogPostService.createPost(author, message);
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public Iterable<BlogPost> getAllPost(){
        return blogPostService.getAllPosts();
    }
}
