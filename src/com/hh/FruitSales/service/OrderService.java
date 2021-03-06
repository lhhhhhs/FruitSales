package com.hh.FruitSales.service;

import com.hh.FruitSales.bean.Order;
import com.hh.FruitSales.dao.OrderDao;
import com.hh.FruitSales.dao.impl.OrderDaoImpl;

import java.util.List;

/**
 * @author sxy
 * @create 2021-04-05-15:00
 */
public class OrderService {
    OrderDao orderDao = new OrderDaoImpl();

    /**
     * 添加訂單
     * @param order
     */
    public void createOrder(Order order){
        orderDao.addOrder(order);
    }

    public List<Order> getList() {
        return orderDao.queryAll();
    }
}
