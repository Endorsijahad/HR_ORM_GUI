/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Country;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lenovo
 */
public class CountryController {
    private final InterfaceDAO idao;

    public CountryController(SessionFactory sessionFactory) {
//        this.type = type;
        idao = new GeneralDAO(sessionFactory, Country.class);
    }

  
    public boolean saveOrUpdate(Object object) {
        return idao.saveOrUpdate(object);
    }


    public boolean delete(Object object) {
        return idao.delete(object);
    }


    public List<Object> getAll() {
        return idao.getAll();
    }


    public List<Object> search(String category, Object key) {
        return idao.search(category, key);
    }


    public Object getById(String countryId) {
        return idao.getById(countryId);
    }
}
