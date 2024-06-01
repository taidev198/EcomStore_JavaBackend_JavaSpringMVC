package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.Order;

import java.util.List;

public interface OrderDAO {

    Order findById(Integer id);
    List<Order> findAll();
    Order create(Order order);
    void update(Order order);
    Order delete(Integer id);
}
