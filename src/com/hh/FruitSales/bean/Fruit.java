package com.hh.FruitSales.bean;

import java.math.BigDecimal;

/**
 * @author sxy
 * @create 2021-03-10-20:16
 */
public class Fruit {
    private Integer id;
    private String name;
    private BigDecimal price;
    private BigDecimal cost;
    private Integer sales;

    public Fruit() {
    }

    public Fruit(Integer id, String name, BigDecimal price, BigDecimal cost, Integer sales) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.sales = sales;
    }

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cost=" + cost +
                ", sales=" + sales +
                '}';
    }
}
