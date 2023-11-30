package inheritance;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddDoctors {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		Consultant c = new Consultant();
		c.setMobileNumber(987747748);
		c.setName("Divakar");
		c.setNo_of_visits(5);
		c.setPaid(2000);
		c.setNo_of_visits(5);
		c.setSalary(2000 * 5);

		ResidentalDoctor rd = new ResidentalDoctor();
		rd.setMobileNumber(998745632);
		rd.setMonthly_salary(50000);
		rd.setName("laxman");

		em.getTransaction().begin();
		em.persist(rd);

		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}
}