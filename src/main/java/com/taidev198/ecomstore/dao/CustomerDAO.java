package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    Customer findById(Integer id);
    List<Customer> findAll();
    Customer create(Customer customer);
    void update(Customer customer);
    Customer delete(Integer id);
}
