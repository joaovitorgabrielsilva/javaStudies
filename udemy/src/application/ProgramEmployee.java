package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int number = src.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < number; i++) {
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("ID: ");
			int id = src.nextInt();
			System.out.print("Name: ");
			src.nextLine();
			String name = src.nextLine();
			System.out.print("Salary: ");
			double salary = src.nextDouble();
			
			if(i!=0) {
				Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if(emp != null) {
					System.out.println("Id ja utilizado, por favor insira um ID diferente");
					i--;
				}else {
					list.add(new Employee(id,name,salary));
				}
			}else {
				list.add(new Employee(id,name,salary));
			}
			
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = src.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage(xx% format): ");
			double percentage = src.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println("List of employees");
		for(Employee obj: list) {
			System.out.println(obj);
		}
		
		
		src.close();
	}

}
