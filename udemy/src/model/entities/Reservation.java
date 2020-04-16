package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//static para nao instanciar para cada reservation que fizer
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)){
			 throw new DomainException("Check-out date must be after check-in date");
		 }
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		 if (checkIn.before(now) || checkOut.before(now)){
			 throw new DomainException("Reservation dates for update must be future dates");
		 }
		if (!checkOut.after(checkIn)){
			 throw new DomainException("Check-out date must be after check-in date");
		 }
		 
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); //Diferença de tempo em millis
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	@Override
	public String toString() {
		return "Reservation: Room " + roomNumber
			   + ", check-in: " + sdf.format(checkIn)
			   + ", check-out: " + sdf.format(checkOut)
			   + ", " + duration() + " nights\n";
	}
	
}

//Throw generico
//throw new IllegalArgumentException("Reservation dates for update must be future dates");

/* Logica de diferença de data usando o calendar
Calendar cal1=Calendar.getInstance(),cal2=Calendar.getInstance();
cal1.setTime(checkIn);
cal2.setTime(checkOut);
int month1 = cal1.get(Calendar.MONTH+1);
int month2 = cal2.get(Calendar.MONTH+1);
return month2-month1;*/