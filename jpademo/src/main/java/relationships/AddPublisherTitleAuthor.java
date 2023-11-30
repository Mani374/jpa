package relationships;

import java.time.LocalDate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddPublisherTitleAuthor {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		Publisher p = new Publisher();
		p.setId("9912");
		p.setName("New publisher");

		Title t = new Title();
		t.setTitleId("789");
		t.setTitle("New Title");
		t.setType("New");
		t.setPubDate(LocalDate.now());

		Author a = new Author();
		a.setId("453-13-7823");
		a.setName("New Author");
		a.setLname("H");
		a.setPhoneNum("9123456789");
		a.setContract(0);

		p.getTitles().add(t);
		a.getTitles().add(t);
		t.getAuthors().add(a);
		
		em.getTransaction().begin();
		em.persist(p);
		em.persist(t);
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
