package pubs;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import util.EntityManagerUtil;
public class ListAuthorsAndTitles {
	public static void main(String[] args) { 
		EntityManagerFactory emf = EntityManagerUtil.getPubs();
		EntityManager em = emf.createEntityManager();
		var query = em.createQuery("from pubs.Author", Author.class);  
		var authors = query.getResultList();
		for (var a : authors) {
			System.out.printf("%-30s\n", a.getFirstName());
			for(var ta : a.getTitleAuthors())
			{
				System.out.println(ta.getTitle().getTitle());
			}
		}

		em.close();
		emf.close();
	}
}