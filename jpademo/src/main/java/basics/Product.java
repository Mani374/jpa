package basics;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "products")
@Entity(name = "basics.Product")
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

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
}
