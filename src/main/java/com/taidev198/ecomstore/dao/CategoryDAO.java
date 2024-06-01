package com.taidev198.ecomstore.dao;

import com.taidev198.ecomstore.entity.Category;

import java.util.List;

public interface CategoryDAO {//must 5 action

    Category findById(Integer id);
    List<Category> findAll();
    Category create(Category category);
    void update(Category category);
    Category delete(Integer id);
}
