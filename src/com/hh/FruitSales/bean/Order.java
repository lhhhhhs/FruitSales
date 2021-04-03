package com.hh.FruitSales.bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sxy
 * @create 2021-03-10-20:29
 */
public class Order {
    private String id;
    private Date createTime;
    private BigDecimal totalPrice;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", createTime=" + createTime +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order() {
    }

    public Order(String id, Date createTime, BigDecimal totalPrice) {
        this.id = id;
        this.createTime = createTime;
        this.totalPrice = totalPrice;
    }
}
