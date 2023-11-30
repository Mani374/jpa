package manytoone2;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ListCategories {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manytoone2.Category", Category.class); // JPQL
		var cats = query.getResultList();

	for (var c : cats) {
		System.out.printf("%s %-30s\n", c.getCode(),c.getDescription());
	
			
			for(var p : c.getProducts())
				System.out.println(p.getName());
 		}

		em.close();
		emf.close();
	}

}