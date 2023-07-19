package db.model.dao.impl;

import db.DB;
import db.model.dao.DepartmentDao;
import db.model.dao.SellerDao;

import java.sql.SQLException;

public class DaoFactory {

    public static SellerDao createSellerDao() throws SQLException {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() throws SQLException {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
