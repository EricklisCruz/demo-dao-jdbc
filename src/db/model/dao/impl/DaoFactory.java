package db.model.dao.impl;

import db.model.dao.SellerDao;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
