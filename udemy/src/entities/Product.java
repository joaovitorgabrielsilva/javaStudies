package entities;

public class Product {
	
	public String name;
	public Double price;
	public Integer quantity;
	//public para outro arquivo poder utilizar
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	private double totalValueInStock() {
		return price*quantity;
	}

	public void addProducts(int quantityToAdd) {
		this.quantity += quantityToAdd;
	}
	//this serve para indicar que é o atributo e eliminar ambiguidades
	public void removeProducts(int quantityToRemove) {
		quantity -= quantityToRemove;
	}

	public String toString() {
		//return name + ", $ "+String.format("%.2f", price) + ", " + quantity+" units, Total: $ "+String.format("%.2f", totalValueInStock());
		return name + ","+String.format("%.2f", totalValueInStock());
	}
	
}
