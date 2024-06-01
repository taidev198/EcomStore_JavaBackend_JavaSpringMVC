package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.OrderDetail;

import java.util.List;

public interface OrderDetailDAO {

    OrderDetail findById(Integer id);
    List<OrderDetail> findAll();
    OrderDetail create(OrderDetail orderDetail);
    void update(OrderDetail orderDetail);
    OrderDetail delete(Integer id);
}
