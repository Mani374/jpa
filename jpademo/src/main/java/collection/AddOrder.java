package collection;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddOrder {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		Order o = new Order();
		o.setCus_name("James");
	    o.setOrder_date("07-10-2016");
		o.getItems().add("mobiles");
		o.getItems().add("Laptops");
		o.getItems().add("Headphones");

		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}