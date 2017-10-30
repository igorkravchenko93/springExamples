package com.kravchenko.repository;

import com.kravchenko.model.Blog;

import javax.transaction.Transactional;
import java.util.List;

public interface BlogRepository {
    @Transactional
    void save(Blog blog);

    List<Blog> getAll();
}
