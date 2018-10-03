/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class CountryDAO extends GeneralDAO{
    private final Class type;
    public CountryDAO(SessionFactory sessionFactory, Class type) {
        super(sessionFactory, type);
        this.type = type;
    }
    
}
