package relationships;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity(name = "relationships.Title")
@Table(name = "titles")
public class Title {
	@Id
	@Column(name = "title_id")
	private String titleId;

	@Column(name = "title", length = 40)
	private String title;

	@Column(name = "type", length = 20)
	private String type;

	@Column(name = "pubdate")
	private LocalDate pubDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pub_id")
	
	private Publisher publisher;

	@ManyToMany(mappedBy = "titles")
	Set<Author> authors = new HashSet<Author>();

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
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

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate localDate) {
		this.pubDate = localDate;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Title [titleId=" + titleId + ", title=" + title + ", type=" + type + ", pubDate=" + pubDate
				+ ", publisher=" + publisher + "]";
	}
}