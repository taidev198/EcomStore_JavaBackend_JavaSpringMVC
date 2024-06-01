package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;
import com.taidev198.ecomstore.entity.Product;

import java.util.List;

public interface ProductDAO {

    Product findById(Integer id);
    List<Product> findAll();
    Product create(Product product);
    void update(Product product);
    Product delete(Integer id);
}
