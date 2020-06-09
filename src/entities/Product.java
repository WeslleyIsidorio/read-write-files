package entities;

import java.util.Locale;

public class Product {
	private String name;
	private Double value;
	private Integer quantity;
	
	
	public Product(String[] vect) {
		this.name = vect[0];
		this.value = Double.parseDouble(vect[1]);
		this.quantity = Integer.parseInt(vect[2]);		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public Double getValue() {
		return value;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public Double totalPrice() {
		return quantity * value;
	}
	
	@Override
	public String toString() {
		Locale.setDefault(Locale.US);
		return name + "," + String.format("%.2f", totalPrice());
	}

}
