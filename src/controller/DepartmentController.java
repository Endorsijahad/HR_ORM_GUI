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
import java.util.Vector;
import javax.swing.JComboBox;
import org.hibernate.SessionFactory;

/**
 *
 * @author Martin
 */
public class DepartmentController {
 
    private final InterfaceDAO iDAO;
    private Vector listManager;
    private Vector listLocation;
    private Vector listDepartment;
    private final EmployeeController empController;
    private final LocationController locController;
    
    public DepartmentController(SessionFactory sessionFactory) {  
        iDAO = new GeneralDAO(sessionFactory, Department.class);
        empController = new EmployeeController(sessionFactory);
        locController = new LocationController(sessionFactory);
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
    
    public void loadCmbDepartmentName(JComboBox cmb){
//        listDepartment = new Vector();
        List<Object> objects = this.getAll();
        for (Object object : objects) {
            Department department = (Department) object;
            cmb.addItem(department.getDepartmentName());
        }
    }
    
    public  void loadCmbManagerId(JComboBox cmb){
//        listManager = new Vector();
        List<Object> objects = (List<Object>) empController.getAll();
        for (Object object : objects) {
            Employee employee = (Employee) object;
            cmb.addItem(employee.getEmployeeId() + " - " + employee.getLastName());
        }
    }
    
    public  void loadCmbLocationId(JComboBox cmb){
        listLocation = new Vector();
        List<Object> objects = locController.getAll();
        for (Object object : objects) {
            Location location = (Location) object;
            cmb.addItem(location.getLocationId() + " - " + location.getCity());
        }
    }
}
