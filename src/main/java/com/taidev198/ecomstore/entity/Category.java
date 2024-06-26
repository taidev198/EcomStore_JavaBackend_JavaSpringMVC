package com.taidev198.ecomstore.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity @Table(name = "Categories")
//la class dung de mo ta ben trong DB
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;
    String nameVN;

    @OneToMany(mappedBy = "category", fetch=FetchType.EAGER)//name of variable on class
    List<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameVN() {
        return nameVN;
    }

    public void setNameVN(String nameVN) {
        this.nameVN = nameVN;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
