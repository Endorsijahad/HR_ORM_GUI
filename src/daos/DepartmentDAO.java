/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Department;
import org.hibernate.SessionFactory;

/**
 *
 * @author Martin
 */
public class DepartmentDAO extends GeneralDAO {

    private final Class type;

    public DepartmentDAO(SessionFactory sessionFactory, Class type) {
        super(sessionFactory, type);
        this.type = type;
    }
     
//    @Override
//    public Object getById(Object id){
//        return super.getById("departmentId", id);
//    }
    
}
