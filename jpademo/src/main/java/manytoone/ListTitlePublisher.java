package manytoone;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitlePublisher {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from manytoone.Titles", Titles.class); // JPQL
		List<Titles> title = query.getResultList();
		
		for (var  t: title) {
			System.out.printf("%s  %f  %10s\n", t.getTitle(), t.getPrice(),t.getPublisher().getName());
			
		}

		em.close();
		emf.close();

			
		
       }

}