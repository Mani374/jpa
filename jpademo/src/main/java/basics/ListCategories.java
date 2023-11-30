package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ListCategories {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory
				                      ("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from basics.Category", Category.class);  // JPQL
		var categories = query.getResultList();

		//System.out.println("Count = " + categories.size());
		
		for (var cat : categories) {
			System.out.printf("%-10s  %s\n",cat.getCode(),cat.getDescription());
		}

		em.close();
		emf.close();

	}

}