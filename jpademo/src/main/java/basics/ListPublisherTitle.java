package basics;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPublisherTitle {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from basics.Publisher", Publisher.class); 
		var Publishers= query.getResultList();
		
		
		for (var  p:Publishers) {
			System.out.printf("%s  ",p.getName());
		
			for (var title : p.getTitles()) {
				System.out.printf("  %s  %.2f%n", title.getTitle(), title.getPrice());
			}
			
		}

		em.close();
		emf.close();

		

	
	
	}
}