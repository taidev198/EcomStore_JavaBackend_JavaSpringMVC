package com.taidev198.ecomstore.dao;

import java.util.List;

public interface AbstractInterfaceDAO<T> {

   <T> T findById(Integer id);
   <T> List<T> findAll();
     T create(T entity);
    void update(T entity);
    <T> T delete(Integer id);
}
