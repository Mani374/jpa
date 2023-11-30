package relationships;
import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "relationships.Publisher")
@Table(name = "publishers")
public class Publisher {
	@Id
	@Column(name = "pub_id", length = 30)
	private String id;

	@Column(name = "pub_name", length = 30)
	private String name;

	@Column(name = "city", length = 20)
	private String city;

	@Column(name = "state", length = 20)
	private String state;

	@Column(name = "country", length = 20)
	private String country;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publisher")
	private Set<Title> titles = new HashSet<Title>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return String.format("%d  %-30s %-20s  %-20s  %s", id, name, city, state, country);
	}
}