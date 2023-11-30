package inheritance;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

@Entity(name = "inheritance.Consultant")
@DiscriminatorValue("2")

public class Consultant extends Doctor {

	private int no_of_visits;
	private int paid;
	private int salary = no_of_visits * paid;

	public int getNo_of_visits() {
		return no_of_visits;
	}

	public void setNo_of_visits(int no_of_visits) {
		this.no_of_visits = no_of_visits;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Consultant [no_of_visits=" + no_of_visits + ", paid=" + paid + ", salary=" + salary + "]";
	}

}
