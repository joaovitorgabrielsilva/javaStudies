package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeHier;
import entities.OutsourcedEmployee;

public class ProgramEmployeeHier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List <EmployeeHier> list= new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numEmployees = sc.nextInt();
		
		for (int i=1;i<=numEmployees;i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else
			list.add(new EmployeeHier(name, hours, valuePerHour));
				
			}
		
			System.out.println("Payments: ");
			for (EmployeeHier emp : list) {
				System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		
	}

}
