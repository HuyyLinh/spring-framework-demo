package com.example.springmvc.jpetstore.services;

import com.example.springmvc.jpetstore.dao.jpa.JpaAccountDao;
import com.example.springmvc.jpetstore.dao.jpa.JpaItemDao;

public class PetStoreServiceImpl {
    private JpaAccountDao accountDao;
    public String name = "linh";

    private JpaItemDao itemDao;

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }
}
