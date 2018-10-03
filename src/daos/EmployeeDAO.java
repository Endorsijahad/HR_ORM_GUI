/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.SessionFactory;

/**
 *
 * @author Nande
 */
public class EmployeeDAO extends GeneralDAO{

    public EmployeeDAO(SessionFactory sessionFactory, Class type) {
        super(sessionFactory, type);
    }
    
    @Override
    public Object getById(Object id){
        return super.getById("employeeId", id);
    }
}
