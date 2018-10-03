/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Department;
import entities.Employee;
import entities.Job;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.SessionFactory;

/**
 *
 * @author Nande
 */
public class EmployeeController {

    private InterfaceDAO iDAO;
    public EmployeeController(SessionFactory sessionFactory) {
        iDAO = new GeneralDAO(sessionFactory, Employee.class);
    }
    
    public Object getAll(){
        return iDAO.getAll();
    }
    
    public Object getById(String employeeId){
        return iDAO.getById(new Integer(employeeId));
    }
    
    public Object search(String category, String value){
        return iDAO.search(category, value);
    }
    
    public boolean delete(String employeeId){
        Employee employee =  new Employee(new Integer(employeeId));
        return iDAO.delete(employee);
    }
    
    public boolean saveOrUpdate(String employeeId, String firstName, String lastName, String email, String phoneNumber,String hireDate, String salary, String commissionPct, String departmentId, String managerId, String jobId){
        Department department = new Department(new Short(departmentId));
        Employee manager = new Employee(new Integer(managerId));
        Job job = new Job(jobId);
        Employee employee = new Employee(new Integer(employeeId), firstName, lastName, email, phoneNumber, new Date(hireDate), new BigDecimal(salary), new BigDecimal(commissionPct), department, manager, job);
        return iDAO.saveOrUpdate(employee);
    }
    
    public Object getNewId(){
        Employee employee =  (Employee) iDAO.getLastId();
        return employee.getEmployeeId() + 1;
    }
}
