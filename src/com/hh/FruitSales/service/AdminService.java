package com.hh.FruitSales.service;

import com.hh.FruitSales.bean.Admin;
import com.hh.FruitSales.dao.AdminDao;
import com.hh.FruitSales.dao.impl.AdminDaoImpl;

/**
 * @author sxy
 * @create 2021-03-20-13:30
 */
public class AdminService {
    AdminDao adminDao = new AdminDaoImpl();

    public String checkedAdmin(String username) {
        Admin admin = adminDao.queryOneByName(username);
        if(admin == null){
            return null;
        }
        return admin.getPassword();
    }
}
