/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Job;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author X453MA
 */
public class JobController {

    private Class type;
    private InterfaceDAO idao;

    public JobController(SessionFactory sessionFactory) {
        this.idao = new GeneralDAO(sessionFactory, Job.class);
    }
    
    public boolean saveOrUpdate(String jobId, String jobTitle, String minSalary, String MaxSalary){
        Job job = new Job(jobId, jobTitle, new Integer(minSalary), new Integer(MaxSalary));
        return idao.saveOrUpdate(job);
    }
    
    public boolean delete(String jobId) {
        Job job = getById(jobId);
        return idao.delete(job);
    }
    
    public Job getById(String jobId){
        Job job = new Job(jobId);
        return (Job) idao.getById(job);
    }
    
    public List<Object> getAll(){
        return idao.getAll();
    }
    
    public List<Object> search(String category, String key){
        return idao.search(category, key);
    }

}

