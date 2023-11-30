package pubs;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name  = "pubs.Author")
@Table(name = "authors")
public class Author {
	@Id
	@Column(name = "au_id")
	private String id;

	@Column(name = "au_fname")
	private String firstName;

	@Column(name = "city")
	private String city;
	
	@OneToMany(mappedBy = "author")
	private Set<TitleAuthor> titleAuthors = new HashSet<TitleAuthor>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<TitleAuthor> getTitleAuthors() {
		return titleAuthors;
	}

	public void setTitleAuthors(Set<TitleAuthor> titleAuthors) {
		this.titleAuthors = titleAuthors;
	}
	
	
}