package composition;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	@Column(length = 30)
	private String email;
	
	@Column(length = 10)
	private String mobileNumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}