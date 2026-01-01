package com.klu.store.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    @Column(nullable = false)
    private String name;

    private String description;

    private double price;

    private int qty;

    public Product() {}

    public Product(String name, String description, double price, int qty) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product [ID=" + pid +
               ", Name=" + name +
               ", Desc=" + description +
               ", Price=" + price +
               ", Qty=" + qty + "]";
    }
}
