/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Country;
import entities.Location;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author USER
 */
public class LocationController {
   private final InterfaceDAO iDAO;

    public LocationController(SessionFactory sessionFactory) {
        iDAO = new GeneralDAO(sessionFactory, Location.class);
    }

    public boolean saveOrUpdate(String locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId) {
        Country country = new Country(countryId);
        Location location = new Location(new Short(locationId), streetAddress, postalCode, city, stateProvince, country);
        return iDAO.saveOrUpdate(location);
    }

    public boolean delete(String locationId) {
        Location location = (Location) iDAO.getById(new Short(locationId));
        return iDAO.delete(location);
    }

    public Location getById(String locationId) {
        return (Location) iDAO.getById(new Short(locationId));
    }

    public List<Object> getAll() {
        return iDAO.getAll();
    }

    public List<Object> searchLoc(String Category, Object key) {
        return iDAO.search(Category, key);
    }
    
    public List<Object> viewLocation() {
        return iDAO.getAll();
    }
    
}
