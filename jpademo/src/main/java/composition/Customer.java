package composition;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "composition.Customer")
@Table(name = "Comp_CUSTOMERS")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 30)
	private String name;

	private Address home;
	private OfficeAddress place;
	private Contact info;

	public Contact getInfo() {
		return info;
	}

	public void setInfo(Contact info) {
		this.info = info;
	}

	public OfficeAddress getPlace() {
		return place;
	}

	public void setPlace(OfficeAddress place) {
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHome() {
		return home;
	}

	public void setHome(Address home) {
		this.home = home;
	}

}