package queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQueryDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_query");
		EntityManager em = emf.createEntityManager();
		
		Query query =   em.createNamedQuery("CostlyTitles", Title.class);
		List<Title> titles = query.getResultList();
		
		for(var t : titles)
			System.out.printf("%-50s  %8.2f\n", t.getTitle(), t.getPrice());
		 
		em.close();
		emf.close();

	}

}
