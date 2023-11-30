package relationships;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity(name = "relationships.Author")
@Table(name = "authors")
public class Author {
	@Id
	@Column(name = "au_id", length = 50)
	private String id;

	@Column(name = "au_fname")
	private String name;

	@Column(name = "au_lname")
	private String lname;

	@Column(name = "phone")
	private String phoneNum;

	@Column(name = "contract")
	private int contract;

	@ManyToMany
	@JoinTable(name = "titleauthor", joinColumns = @JoinColumn(name = "au_id"), inverseJoinColumns = @JoinColumn(name = "title_id"))
	Set<Title> titles = new HashSet<Title>();

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getContract() {
		return contract;
	}

	public void setContract(int contract) {
		this.contract = contract;
	}

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

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
}