import db.model.dao.SellerDao;
import db.model.dao.impl.DaoFactory;
import db.model.entities.Department;
import db.model.entities.Seller;

import java.sql.SQLException;
import java.util.Date;
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

        System.out.println("INSERT");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New ID= " + newSeller.getId());

        System.out.println("UPDATE");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("DELETE");
        int id = 8;
        sellerDao.deleteById(id);
        System.out.println("DONE");
    }
}