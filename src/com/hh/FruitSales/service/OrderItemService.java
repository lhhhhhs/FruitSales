package com.hh.FruitSales.service;

import com.hh.FruitSales.bean.OrderItem;
import com.hh.FruitSales.dao.OrderDao;
import com.hh.FruitSales.dao.OrderItemDao;
import com.hh.FruitSales.dao.impl.OrderItemDaoImpl;

import java.math.BigDecimal;

/**
 * @author sxy
 * @create 2021-04-05-14:08
 */
public class OrderItemService {

    OrderItemDao orderItemDao = new OrderItemDaoImpl();

    /**
     * 添加
     * @param orderItem
     */
    public void insertOrderItem(OrderItem orderItem){
        orderItemDao.addOrderItem(orderItem);
    }

    public BigDecimal getTotalPriceByOid(String oid) {
        return orderItemDao.getTotalPriceByOid(oid);
    }
}
