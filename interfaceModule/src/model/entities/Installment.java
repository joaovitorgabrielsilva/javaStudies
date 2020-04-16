package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date date;
	private Double price;
	
	public Installment() {
	}
	public Installment(Date date, Double price) {
		this.date = date;
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return sdf.format(date) + " - " + String.format("%.2f", price);
 	}
	
}
