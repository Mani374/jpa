package composition;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Parking {
	@Column(length = 30)
	private String parking_Code;
	@Column
	private int area;
	@Column
	private int length;

	@Column
	private int width;

	public String getParking_Code() {
		return parking_Code;
	}

	public void setParking_Code(String parking_Code) {
		this.parking_Code = parking_Code;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}