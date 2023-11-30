package inheritance;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListDoctors {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		var doctors = em.createQuery("from inheritance.Doctor", Doctor.class).getResultList();

		for (var d : doctors) {
			System.out.printf("%-5d %-10s %d\n", d.getId(), d.getName(), d.getMobileNumber());

		}

		em.close();
		emf.close();
	}
}