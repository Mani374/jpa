package composition;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCustomer {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		Customer c = new Customer();
		c.setName("David");
		Address a = new Address();
		a.setAddress("21-302-23");
		a.setCity("New York");
		c.setHome(a);
		OfficeAddress of = new OfficeAddress(); 
		of.setOffAddress("12-101-32");
		of.setOffCity("Hoboken");
		c.setPlace(of);
		Contact ca = new Contact();
		ca.setEmail("contact@gamil.com");
		ca.setMobileNumber("9966896222");
		c.setInfo(ca);

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}