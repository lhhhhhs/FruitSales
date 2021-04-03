package com.hh.FruitSales.test;

import com.hh.FruitSales.bean.Admin;
import com.hh.FruitSales.dao.AdminDao;
import com.hh.FruitSales.dao.impl.AdminDaoImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author sxy
 * @create 2021-03-10-21:24
 */
public class AdminDaoTest {

    AdminDao adminDao = new AdminDaoImpl();

    @Test
    public void addAdmin() {
        adminDao.addAdmin(new Admin(null, "test", "test"));
    }

    @Test
    public void update() {
        adminDao.update(new Admin(2, "test", "test"));
    }

    @Test
    public void queryAll() {
        List<Admin> admins = adminDao.queryAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }

    @Test
    public void queryOneByName() {
        Admin lhh2 = adminDao.queryOneByName("lhh2");
        System.out.println(lhh2);
    }


    @Test
    public void del() {
        adminDao.del(3);
    }
}