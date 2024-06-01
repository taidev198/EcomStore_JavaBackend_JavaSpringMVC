package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.OrderDetail;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderDetailDAOImpl implements OrderDetailDAO {

    //tiem session factory
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public OrderDetail findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        OrderDetail orderDetail = session.find(OrderDetail.class, id);//find
        return orderDetail;
    }

    @Override
    public List<OrderDetail> findAll() {
        String sql = "from OrderDetail ";
        TypedQuery<OrderDetail> query = sessionFactory.getCurrentSession().createQuery(sql, OrderDetail.class);
        return query.getResultList();
    }

    @Override
    public OrderDetail create(OrderDetail entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
        return entity;
    }

    @Override
    public void update(OrderDetail entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
    }

    @Override
    public OrderDetail delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        OrderDetail orderDetail = session.get(OrderDetail.class, id);
        session.delete(orderDetail);
        return orderDetail;
    }
}
