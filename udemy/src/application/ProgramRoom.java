package application;

import java.util.Scanner;

import entities.Room;

public class ProgramRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hotel exercise

		Scanner src = new Scanner(System.in);

		final int NUMBER_OF_ROOMS = 10;
		Room[] hotel = new Room[NUMBER_OF_ROOMS];

		System.out.print("How many rooms will be rented? ");
		int rent = src.nextInt();
		src.nextLine();
		for (int i = 0; i < rent; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = src.nextLine();
			System.out.print("Email: ");
			String email = src.nextLine();
			System.out.print("Room: ");
			int room = src.nextInt();
			src.nextLine();
			hotel[room] = new Room(name, email);
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < hotel.length; i++) {
			if (hotel[i] != null)
				System.out.println(i + ": " + hotel[i]);
		}

		src.close();

	}

}
