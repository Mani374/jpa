package pubs;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name  = "pubs.TitleAuthor")
@Table(name = "titleauthor")
@IdClass(TitleAuthorPk.class)
public class TitleAuthor {
 	@Id
	private String auId;
	@Id
	private String titleId;
	
	@Column(name= "au_ord")
	private int order;
	
	@ManyToOne
    @JoinColumn( name = "au_id", insertable=false, updatable = false)
	private Author author;
	
	@ManyToOne
    @JoinColumn( name = "title_id", insertable=false, updatable = false)
	private Title title;

	public String getAuId() {
		return auId;
	}

	public void setAuId(String auId) {
		this.auId = auId;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	
	
	
}