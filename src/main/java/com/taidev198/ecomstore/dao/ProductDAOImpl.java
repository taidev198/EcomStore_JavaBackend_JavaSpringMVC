package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.Product;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductDAOImpl implements ProductDAO{

    //tiem session factory
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Product findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = session.find(Product.class, id);//find
        return product;
    }

    @Override
    public List<Product> findAll() {
        String sql = "from Product ";
        TypedQuery<Product> query = sessionFactory.getCurrentSession().createQuery(sql, Product.class);
        return query.getResultList();
    }

    @Override
    public Product create(Product entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
        return entity;
    }

    @Override
    public void update(Product entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
    }

    @Override
    public Product delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);
        session.delete(product);
        return product;
    }

}
