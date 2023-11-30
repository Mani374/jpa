package queries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPubCount {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_query");
		EntityManager em = emf.createEntityManager();

		var result = em.createQuery("select new queries.PubTitleCount(p.name, size(p.titles)) from Publisher as p")
				.getResultList();

		for (Object obj : result) {
			System.out.println(obj.getClass());
			System.out.println(obj.toString());
		}
		em.close();
		emf.close();
	}

}
