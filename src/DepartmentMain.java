import db.model.dao.DepartmentDao;
import db.model.dao.impl.DaoFactory;
import db.model.entities.Department;

import java.sql.SQLException;
import java.util.List;

public class DepartmentMain {

    public static void main(String[] args) throws SQLException {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        Department department = departmentDao.findById(1);

        System.out.println(department);

        System.out.println("FIND ALL DEPARTMENT");
        List<Department> allDepartments = departmentDao.findAll();
        allDepartments.forEach(System.out::println);

        System.out.println("INSERT");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New ID= " + newDepartment.getId());

        System.out.println("UPDATE");
        department = departmentDao.findById(1);
        department.setName("Notebooks");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("DELETE");
        int id = 6;
        departmentDao.deleteById(id);
        System.out.println("DONE");
    }
}
