package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.Order;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderDAOImpl implements OrderDAO{

    //tiem session factory
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Order findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = session.find(Order.class, id);//find
        return order;
    }

    @Override
    public List<Order> findAll() {
        String sql = "from Order ";
        TypedQuery<Order> query = sessionFactory.getCurrentSession().createQuery(sql, Order.class);
        return query.getResultList();
    }

    @Override
    public Order create(Order entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
        return entity;
    }

    @Override
    public void update(Order entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
    }

    @Override
    public Order delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = session.get(Order.class, id);
        session.delete(order);
        return order;
    }

}
