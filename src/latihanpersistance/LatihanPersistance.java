/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpersistance;

import controller.EmployeeController;
import entities.Employee;
import java.util.List;
import java.util.Scanner;
import tools.HibernateUtil;

/**
 *
 * @author Ignatius
 */
public class LatihanPersistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        RegionController regionController = new RegionController(HibernateUtil.getSessionFactory(), Region.class);
//        for (Object object : (List<Region>) regionController.getAll()) {
//            Region region = (Region) object;
//            System.out.println(region.getRegionId() + " - " + region.getRegionName());
//        }

        EmployeeController employeeController = new EmployeeController(HibernateUtil.getSessionFactory());
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            cls();
            System.out.println("1. Save or Update");
            System.out.println("2. Search");
            System.out.println("3. Get by Id");
            System.out.println("4. Get All");
            System.out.print("Pilihan menu: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(employeeController.saveOrUpdate("215", "Pertama", "Akhir", "PAKHIR",
                            "8484847", "06/06/2018", "5500", ".5", "60", "103", "IT_PROG"));
                    break;
                case 2:
                    System.out.println("Employee ID - First Name - Last Name");
                    for (Object object : (List<Employee>) employeeController.search("lastName", "King")) {
                        Employee employee2 = (Employee) object;
                        System.out.println(employee2.getEmployeeId() + " - " + employee2.getFirstName() + " " + employee2.getLastName());
                    }
                    break;
                case 3:
                    Object object3 = (Employee) employeeController.getById("100");
                    Employee employee3 = (Employee) object3;
                    System.out.println(employee3.getFirstName() + " " + employee3.getLastName());
                    break;
                case 4:
                    System.out.println("Employee ID - First Name - Last Name - Email - Phone Number - Hire Date - Salary - Commission PCT - Job - Manager - Department");
                    for (Object object : (List<Employee>) employeeController.getAll()) {
                        Employee employee = (Employee) object;
                        String managerName = "", departmentName = "";
                        if (employee.getManagerId() == null) {
                            managerName = "null";
                        } else {
                            managerName = employee.getManagerId().getLastName();
                        }
                        if (employee.getDepartmentId() == null) {
                            departmentName = "null";
                        } else {
                            departmentName = employee.getDepartmentId().getDepartmentName();
                        }
                        System.out.println(employee.getEmployeeId() + " - " + employee.getFirstName() + " - " + employee.getLastName() + " - " + employee.getEmail()
                                + " - " + employee.getPhoneNumber() + " - " + employee.getHireDate() + " - " + employee.getSalary() + " - " + employee.getCommissionPct()
                                + " - " + employee.getJobId().getJobTitle() + " - " + managerName + " - " + departmentName);
                    }
                    break;
                default:
                    loop = false;
                    break;
            }
        } while (loop);

    }

    public static void cls() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.print(e);
        }

    }
}

////        Region region = new Region(new BigDecimal("13"));
////        region.setRegionName("coba saja lagi");
//////        GeneralDAO dAOS = new GeneralDAO(HibernateUtil
//////                .getSessionFactory(), Region.class);
//////        System.out.println(dAOS.saveOrUpdate(region));
////        InterfaceDAO iDAO = new GeneralDAO(HibernateUtil
////                .getSessionFactory(), Region.class);
////        System.out.println(iDAO.saveOrUpdate(region));
////        System.out.println(iDAO.delete("13"));
////        for (Object object : iDAO.getAll()) {
////            Region r = (Region) object;
////            System.out.println(r.getRegionId()+" - "
////                    +r.getRegionName()+" -  ");
////            for (Country country : r.getCountryList()) {
////                System.out.println(country.getCountryId()+" - "
////                        +country.getCountryName()+" : ");
////                for (Location location : country.getLocationList()) {
////                    System.out.print(location.getLocationId()+" - "
////                            +location.getCity()+", ");
////                    for (Department department : location.getDepartmentList()) {
////                        System.out.println(department.getDepartmentId()+" - "
////                                +department.getDepartmentName());
////                        for (Employee employee : department.getEmployeeList()) {
////                            System.out.println(employee.getLastName());
////                        }
////                        System.out.println("");
////                    }
////                    System.out.println("");
////                }
////                System.out.println("");
////            }
////            System.out.println("");
////        }
////        for (Object object : iDAO.search("regionName", "a")) {
////            Region r = (Region) object;
////            System.out.println(r.getRegionId()+" - "
////                    +r.getRegionName());
////        }
////        Region r = (Region) iDAO.getById("4");
////        System.out.println(r.getRegionName());
//
//    InterfaceDAO iDAO = new RegionDAO(HibernateUtil
//            .getSessionFactory(), Region.class);
//    Region region = new Region(new BigDecimal("14"));
//    region.setRegionName("Kotor");
////        System.out.println(iDAO.saveOrUpdate(region));
////        System.out.println(iDAO.delete("14"));
//    region = (Region) iDAO.getById("regionId", "11");
////        System.out.println(region.getRegionName());
////        for (Object object : iDAO.search("regionName", "Asia")) {
////        for (Object object : iDAO.getAll()) {
////            region = (Region) object;
////            System.out.println(region.getRegionId());
////        }
//        iDAO = new CountryDAO(HibernateUtil
//                .getSessionFactory(), Country.class);
//        for (Object object : iDAO.getAll()) {
//            Country country = (Country) object;
//            System.out.println(country.getCountryName());
//        }
