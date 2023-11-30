package pubs;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "pubs.Publisher")
@Table(name = "publishers")
public class Publisher {

	@Id
	@Column(name = "pub_id")
	private String id;

	@Column(name = "pub_name")
	private String name;

	@Column
	private String city;
	
	@OneToMany(mappedBy = "publisher")
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

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
	
	
}