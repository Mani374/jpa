package basics;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sales1")
@Entity(name = "basics.Sale")

public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Invno")
	private int invno;

	@Column(name = "Prodid")
	private int id;

	@Column(name = "Transdate")
	private String date;

	@Column(name = "Qty")
	private int qty;

	@Column(name = "Amount")
	private double amount;

	public int getInvno() {
		return invno;
	}

	public void setInvno(int invno) {
		this.invno = invno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
