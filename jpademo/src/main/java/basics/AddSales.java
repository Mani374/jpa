package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddSales {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		Sales s = new Sales();
		s.setId(103);
		s.setDate("5/23/22");
		s.setQty(4);
		s.setAmount(4800);

		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
