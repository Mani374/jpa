package basics;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) {
		var emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from basics.Product", Product.class);
		var products = query.getResultList();

		for (var product : products) {
			System.out.printf("%d  %-30s %8.2f %d\n", product.getId(), product.getName(), product.getCost(),
					product.getQuantity());
		}
		
		em.close();
		emf.close();

	}
}