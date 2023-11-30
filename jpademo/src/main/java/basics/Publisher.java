package basics;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "basics.publisher")
@Table(name = "Publishers")

public class Publisher {
	@Id
	@Column(name = "pub_id")
	private int Pid;

	@Column(name = "pub_name")
	private String name;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "Country")
	private String country;

	
	@OneToMany(cascade=CascadeType.ALL,mappedBy= "publisher")
	private List<Titles> titles;
	
	
	
	
	public List<Titles> getTitles() {
		return titles;
	}

	public void setTitles(List<Titles> titles) {
		this.titles = titles;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
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

}