package queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitlePublisher {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_query");
		EntityManager em = emf.createEntityManager();

		// N + 1 problem 
		//List<Title> titles = em.createQuery("from Title").getResultList(); 
		
		// NO N + 1 problem using join fetch
		List<Title> titles = em.createQuery("from Title as t JOIN FETCH t.publisher").getResultList();

		for (Title t : titles) {
			System.out.println(t.getTitle() + " - " + t.getPublisher().getName());
		}
		em.close();
		emf.close();
	}

}
