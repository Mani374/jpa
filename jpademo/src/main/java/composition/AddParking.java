package composition;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddParking {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_ddl");
		EntityManager em = emf.createEntityManager();

		House h = new House();

		h.setOwner_Name("Mani");
		h.setHouse_type("formhouse");

		Parking p = new Parking();
		p.setParking_Code("S-2");
		p.setLength(20);
		p.setWidth(10);
		p.setArea(20 * 10);
		h.setPlace(p);

		em.getTransaction().begin();
		em.persist(h);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}