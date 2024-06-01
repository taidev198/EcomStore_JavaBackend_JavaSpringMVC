package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.Customer;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{

    //tiem session factory
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Customer findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.find(Customer.class, id);//find
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        String sql = "from Customer";
        TypedQuery<Customer> query = sessionFactory.getCurrentSession().createQuery(sql, Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer create(Customer entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
        return entity;
    }

    @Override
    public void update(Customer entity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(entity);//== save(entity)
    }

    @Override
    public Customer delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        session.delete(customer);
        return customer;
    }
}
