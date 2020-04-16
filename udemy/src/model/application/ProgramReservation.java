package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ProgramReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber,checkIn,checkOut); 
			System.out.println(reservation);
	
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error, verify inputs");
		}
		
		sc.close();
	}

}

/*Lógica de trativa de erro nas inputs dentro da main antes do update
 * if (!checkOut.after(checkIn)){
 *	"Error in reservation: Check-out date must be after check-in date"
 *	}else
 *{
 *Reservation reservation = new Reservation(roomNumber,checkIn,checkOut);
 *System.out.println(reservation);
 *}
 *Date now = new Date();
 *if (checkIn.before(now) || checkOut.before(now)){
 *}else if (!checkOut.after(checkIn)){
 *	"Error in reservation: Check-out date must be after check-in date"
 *}
 *
 * */
