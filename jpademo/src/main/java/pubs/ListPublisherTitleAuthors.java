package pubs;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import util.EntityManagerUtil;

public class ListPublisherTitleAuthors {
	public static void main(String[] args) {

		EntityManagerFactory emf = EntityManagerUtil.getPubs();
		EntityManager em = emf.createEntityManager();

		var query = em.createQuery("from pubs.Publisher", Publisher.class);
		var publishers = query.getResultList();

		for (var pub : publishers) {
			System.out.printf("%-30s\n%s\n", pub.getName(), "=".repeat(30));
			for (var title : pub.getTitles()) {
				System.out.println(title.getTitle());
				// get all authors
				for (var ta : title.getTitleAuthors()) {
					System.out.println(ta.getAuthor().getFirstName().indent(10));
				}
			}
		}

		em.close();
		emf.close();
	}
}