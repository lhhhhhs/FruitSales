package com.hh.FruitSales.service;

import com.hh.FruitSales.bean.Fruit;
import com.hh.FruitSales.dao.FruitDao;
import com.hh.FruitSales.dao.impl.FruitDaoImpl;

import java.util.List;

/**
 * @author sxy
 * @create 2021-03-22-20:32
 */
public class FruitService {
    FruitDao fruitDao = new FruitDaoImpl();

    public List<Fruit> getAll() {
        return fruitDao.queryAll();
    }

    public Fruit getOneByFid(int fid1) {
       return  fruitDao.queryOneByFid(fid1);
    }

    public void updateSales(int fid1, int newSales) {
        fruitDao.updateSales(fid1, newSales);
    }
}
