package pubs;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TitleAuthorPk implements Serializable {

	@Column(name = "au_id")
	private String auId;

	@Column(name = "title_id")
	private String titleId;

	public TitleAuthorPk() {
		super();
	}

	public TitleAuthorPk(String auId, String titleId) {
		super();
		this.auId = auId;
		this.titleId = titleId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auId, titleId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TitleAuthorPk other = (TitleAuthorPk) obj;
		return Objects.equals(auId, other.auId) && Objects.equals(titleId, other.titleId);
	}

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

	
}