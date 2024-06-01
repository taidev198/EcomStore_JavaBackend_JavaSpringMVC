package com.taidev198.ecomstore.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Orderdetail")

public class OrderDetail {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
//    Integer orderId;
    @ManyToOne
    @JoinColumn(name = "orderId")
        Order order;
//    Integer productId;
    @ManyToOne
    @JoinColumn(name = "productId")
        Product product;
    Integer quantity;
    Double unitPrice;
    Double discount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
