package gravar;

import java.io.Serializable;

public class produto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Double price;
	private Integer quantity;
	
	
	public produto() {
		
	}

	public produto(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "produto [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}
