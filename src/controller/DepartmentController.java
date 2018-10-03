/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.InterfaceDAO;
import daos.DepartmentDAO;
import daos.GeneralDAO;
import entities.Department;
import entities.Employee;
import entities.Location;
import java.util.List;
import javax.swing.JComboBox;
import org.hibernate.SessionFactory;

/**
 *
 * @author Martin
 */
public class DepartmentController {
 
    private final InterfaceDAO iDAO;
    
    public DepartmentController(SessionFactory sessionFactory) {  
        iDAO = new GeneralDAO(sessionFactory, Department.class);
    }
    
    public boolean saveOrUpdate(String departmentId, String departmentName, String managerId, String locationId){
        Employee manager = new Employee(new Integer(managerId));
        Location location = new Location(new Short(locationId));
        Department department = new Department(new Short(departmentId), departmentName, manager, location);
        return iDAO.saveOrUpdate(department);
    }
    
    public boolean delete(String departmentId){
        Department department = (Department) getById(departmentId);
        return iDAO.delete(department);
    }
    
    public Object getById(String departmentId){
        return iDAO.getById(new Short(departmentId));
    }
    
    public List<Object> search(String category, Object key){
        return iDAO.search(category, key);
    }
    
    public List<Object> getAll(){
        return iDAO.getAll();
    }
    
    public Object getNewId(){
        Department department =  (Department) iDAO.getLastId();
        return department.getDepartmentId() + 1;
    }
    
}
