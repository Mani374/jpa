package manytoone;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity(name = "manytoone.Titles")
@Table(name = "titles")
public class Titles {
	@Id
	@Column(name = "Title_id")
	private String t_id;

	@Column(name = "title")
	private String title;

	@Column(name = "type")
	private String type;

	@Column(name = "pub_id")
	private int Pid;

	@Column(name = "price")
	private Double price;

	@Column(name = "Royalty")
	private Integer royalty;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pub_id", insertable = false, updatable = false)
	private Publisher publisher;

//	@OneToMany(cascade=CascadeType.ALL,mappedBy= "")
//	private List<Titles> publisher;
//	

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRoyalty() {
		return royalty;
	}

	public void setRoyalty(int royalty) {
		this.royalty = royalty;
	}

	@Override
	public String toString() {
		return "Titles [t_id=" + t_id + ", title=" + title + ", type=" + type + ", Pid=" + Pid + ", price=" + price
				+ ", royalty=" + royalty + "]";
	}
}