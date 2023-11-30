package relationships;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitles {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		List<Title> titles = em.createQuery("from relationships.Title", Title.class).getResultList();

		for (Title t : titles) {
			System.out.println(t.getTitle());
		}

		em.close();
		emf.close();
	}
}