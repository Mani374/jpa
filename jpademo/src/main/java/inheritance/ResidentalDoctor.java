package inheritance;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

@Entity(name = "inheritance.ResidentalDoctor")
@DiscriminatorValue("1")
public class ResidentalDoctor extends Doctor {

	protected int monthly_salary;

	public int getMonthly_salary() {
		return monthly_salary;
	}

	public void setMonthly_salary(int monthly_salary) {
		this.monthly_salary = monthly_salary;
	}

	@Override
	public String toString() {
		return "ResidentalDoctor [monthly_salary=" + monthly_salary + "]";
	}

}
