package entities;

import java.util.Objects;

//public class Produto implements Comparable<Produto> { => Com comparator não será necessário definir dentro da classe o comparable.
public class Produto {
	private String name;
	private Double price;
	
	public Produto(String name, Double price) {
		this.name = name;
		this.price = price;
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
	
	/*
	
	@Override
	public int compareTo(Produto o) {
		return name.toUpperCase().compareTo(o.getName().toUpperCase());
	}
	
	*/
	
	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + "]";
	}
	
	
}
