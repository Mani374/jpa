package composition;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OfficeAddress {
	@Column(length = 30)
	private String offAddress;

	@Column(length = 30)
	private String offCity;

	public String getOffAddress() {
		return offAddress;
	}

	public void setOffAddress(String offAddress) {
		this.offAddress = offAddress;
	}

	public String getOffCity() {
		return offCity;
	}

	public void setOffCity(String offCity) {
		this.offCity = offCity;
	}

}