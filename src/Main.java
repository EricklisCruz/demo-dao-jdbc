import db.model.dao.DepartmentDao;
import db.model.dao.SellerDao;
import db.model.dao.impl.DaoFactory;
import db.model.entities.Department;
import db.model.entities.Seller;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(1);


        System.out.println(seller);

        System.out.println("DEPARTMENT");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        list.forEach(System.out::println);

        System.out.println("FIND ALL SELLER");
        List<Seller> allSellers = sellerDao.findAll();
        allSellers.forEach(System.out::println);
    }
}