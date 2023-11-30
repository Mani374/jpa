package composition;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "composition.House")
@Table(name = "HosuseInfo")
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 30)
	private String owner_Name;
	@Column(length = 30)
	private String house_type;

	@Embedded
	private Parking place;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner_Name() {
		return owner_Name;
	}

	public void setOwner_Name(String owner_Name) {
		this.owner_Name = owner_Name;
	}

	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public Parking getPlace() {
		return place;
	}

	public void setPlace(Parking place) {
		this.place = place;
	}

}
