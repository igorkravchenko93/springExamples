package com.kravchenko.repository;

import com.kravchenko.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class BlogRepositoryImpl implements BlogRepository {


    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Blog blog) {
        em.persist(blog);
    }

    @Override
    public List<Blog> getAll() {
        return em.createQuery("from Blog", Blog.class).getResultList();
    }


}
