package basics;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "categories")
@Entity(name="basics.Category")
public class Category {
	@Id  // primary key 
	@Column(name = "catcode")
	private String code;

	@Column(name = "catdesc")
	private String description;
//@OneToMany (cascade = CascadeType.ALL, mappedBy = "category") 
	List<Product> products = new ArrayList<>();
	
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}
}