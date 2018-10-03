/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.math.BigDecimal;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class RegionDAO extends GeneralDAO{
    private final Class type;
    
    public RegionDAO(SessionFactory sessionFactory, Class type) {
        super(sessionFactory, type);
        this.type = type;
    }
    
    public Object getById(Object id){
        return super.getById("regionId", id);
    }
}
