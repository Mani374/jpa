package queries;

// Data Transfer Object (DTO)
public class PubTitleCount {
	private String publisher;
	private int titleCount;

	public PubTitleCount(String publisher, int titleCount) {
		super();
		this.publisher = publisher;
		this.titleCount = titleCount;
	}

	public PubTitleCount() {
		super();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getTitleCount() {
		return titleCount;
	}

	public void setTitleCount(int titleCount) {
		this.titleCount = titleCount;
	}

	@Override
	public String toString() {
		return  publisher + " - " + titleCount;
	}

	
}
