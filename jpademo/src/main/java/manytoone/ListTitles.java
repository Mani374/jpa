package manytoone;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitles {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manytoone.Titles", Titles.class);
		List<Titles> Titles = query.getResultList();

		for (var t : Titles) {
			System.out.printf("%S  %-5f\n", t.getTitle(), t.getPrice());

		}

		em.close();
		emf.close();

	}
}