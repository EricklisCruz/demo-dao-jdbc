package db.model.dao;

import db.model.entities.Department;
import db.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
