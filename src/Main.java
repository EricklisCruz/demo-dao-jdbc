import db.model.dao.SellerDao;
import db.model.dao.impl.DaoFactory;
import db.model.entities.Seller;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(1);


        System.out.println(seller);
    }
}