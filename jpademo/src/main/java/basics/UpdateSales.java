package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateSales {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		var sales = em.find(Sales.class, 1);

		if (sales != null) {
			em.getTransaction().begin();
			sales.setDate("5/1/22");
			em.getTransaction().commit();
		} else
			System.out.println("Sorry! date not found!");
		em.close();
		emf.close();

	}

}
