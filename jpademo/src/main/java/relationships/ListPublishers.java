package relationships;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublishers {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		List<Publisher> publishers = em.createQuery("from relationships.Publisher", Publisher.class).getResultList();

		for (Publisher p : publishers) {
			System.out.println(p.getName());
		}
		em.close();
		emf.close();
	}
}