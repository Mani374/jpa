package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListSales {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		var query = em.createQuery("from manytoone.Sales", Sales.class);
		var Sales = query.getResultList();
		for (var s : Sales) {
			System.out.printf("%d %3d %d  %8.2f\n", s.getInvno(), s.getId(), s.getQty(), s.getAmount());
		}

		em.close();
		emf.close();

	}

}
