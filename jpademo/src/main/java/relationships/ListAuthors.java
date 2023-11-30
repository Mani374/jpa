package relationships;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListAuthors {

	public static void main(String[] args) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		List<Author> authors = em.createQuery("from relationships.Author", Author.class).getResultList();

		for (Author a : authors) {
			System.out.println(a.getName());
		}
		em.close();
		emf.close();
	}
}