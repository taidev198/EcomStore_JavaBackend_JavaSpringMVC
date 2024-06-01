package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Transactional
public class CategoryDAOImpl implements CategoryDAO{

    //tiem session factory
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Category findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Category category = session.find(Category.class, id);//find
        return category;
    }

    @Override
    public List<Category> findAll() {
        String sql = "from Category";
        TypedQuery<Category> query = sessionFactory.getCurrentSession().createQuery(sql, Category.class);
        return query.getResultList();
    }

    @Override
    public Category create(Category entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
        return entity;
    }

    @Override
    public void update(Category entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
    }

    @Override
    public Category delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Category category = session.get(Category.class, id);
        session.delete(category);
        return category;
    }
}
