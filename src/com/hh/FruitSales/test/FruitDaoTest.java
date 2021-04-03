package com.hh.FruitSales.test;

import com.hh.FruitSales.bean.Fruit;
import com.hh.FruitSales.dao.FruitDao;
import com.hh.FruitSales.dao.impl.FruitDaoImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author sxy
 * @create 2021-03-11-17:23
 */
public class FruitDaoTest {

    FruitDao fruitDao = new FruitDaoImpl();

    @Test
    public void addFruit() {
        fruitDao.addFruit(new Fruit(null, "西瓜", new BigDecimal(5), new BigDecimal(3), 0));

    }

    @Test
    public void update() {
        fruitDao.update(new Fruit(1, "西瓜", new BigDecimal(5), new BigDecimal(3), 0));
    }

    @Test
    public void queryAll() {
        List<Fruit> list = fruitDao.queryAll();
        for (Fruit fruit : list) {
            System.out.println(fruit);
        }
    }

    @Test
    public void queryOneByName() {
        Fruit fruit = fruitDao.queryOneByName("西瓜");
        System.out.println(fruit);
    }
}