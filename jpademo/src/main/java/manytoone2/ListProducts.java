package manytoone2;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ListProducts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manytoone2.Product", Product.class); 
		var products = query.getResultList();

		for (var p : products) {
			System.out.printf("%-30s  %-30s\n", p.getName(), p.getCategory().getDescription());
	
		}

		em.close();
		emf.close();
	}

}