package jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;


import controller.EmployeeController;

public class TestNewEmployee {
	
	 @Autowired
     EmployeeController employee;
	 static NewEmployee newemp=new NewEmployee();
	

	    private static EntityManager em;

	    

	    //create new Employee
	    public static void createEmployee(String name, String qualification) {
	    	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
		        em = emf.createEntityManager();
	        em.getTransaction().begin();
	        NewEmployee emp = new NewEmployee();
	        emp.setName(name);
	        emp.setQualification(qualification);
	        em.persist(emp);
	        em.getTransaction().commit();
	        
	    }
	        
}
