package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	//public para outro arquivo poder utilizar
	
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
		return name + ", $ "+String.format("%.2f", price) + ", " + quantity+" units, Total: $ "+String.format("%.2f", totalValueInStock());
	}
	
}
