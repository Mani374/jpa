package manytoone;

import javax.persistence.EntityManager;


import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) {
		var emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manytoone.Product", Product.class);
		var products = query.getResultList();

		for (var product : products) {
			System.out.printf("%10d  ", product.getId());
		}

		em.close();
		emf.close();

	}
}