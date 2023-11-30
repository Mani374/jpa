package manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "products")
@Entity(name = "manytoone.Product")
public class Product {
	@Id
	@Column(name = "ProdId")
	private int id;

	@Column(name = "ProdName")
	private String name;

	@Column(name = "Price")
	private double cost;

	@Column(name = "Qoh")
	private int quantity;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
	private List<Sales> s = new ArrayList<Sales>();


	public List<Sales> getS() {
		return s;
	}

	public void setS(List<Sales> s) {
		this.s = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
