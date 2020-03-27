
//import java.util.Locale;
//import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		// List exercise
		
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
		
		/* Hotel exercise
		
		Scanner src = new Scanner(System.in);
		
		final int NUMBER_OF_ROOMS = 10;
		Room[] hotel = new Room[NUMBER_OF_ROOMS];
		
		System.out.print("How many rooms will be rented? ");
		int rent = src.nextInt();
		src.nextLine();
		for(int i =0; i<rent;i++) {
			System.out.println("Rent #"+(i+1)+":");
			System.out.print("Name: ");
			String name = src.nextLine();
			System.out.print("Email: ");
			String email = src.nextLine();
			System.out.print("Room: ");
			int room = src.nextInt();
			src.nextLine();
			hotel[room] = new Room(name,email);
		}
		System.out.println("Busy rooms:");
		for(int i=0;i<hotel.length;i++) {
			if (hotel[i]!=null)
					System.out.println(i+": "+ hotel[i]);
		}
		
		src.close();
		*/
		
		/* Account Exercise
		Scanner src = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = src.nextInt();
		System.out.print("Enter account holder: ");
		src.nextLine();//para limpar o buffer
		String holder = src.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = src.next().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = src.nextDouble();	
			acc = new Account(number,holder,deposit);
		}else {
			acc = new Account(number,holder);
		}
		System.out.println("Account data: \n" + acc);

		
		System.out.print("/nEnter a deposit value: ");
		acc.deposit(src.nextDouble());
		System.out.println("Updated account data: \n" + acc);

		System.out.print("/nEnter a withdraw value: ");
		acc.withdraw(src.nextDouble());
		System.out.println("Updated account data: \n" + acc);

		src.close();
		
		*/	
		/*
		 * //Product Exercise Scanner input = new Scanner(System.in); Product item = new
		 * Product();
		 * 
		 * //Locale.setDefault(Locale.US);
		 * System.out.println("Realize o cadastro do produto no banco de dados");
		 * System.out.print("Insira o nome:"); item.name = input.next();
		 * 
		 * System.out.print("Insira o pre�o do item (use , como separador decimal):");
		 * item.price = input.nextDouble();
		 * System.out.print("Insira a quantidade (inteira) do item:"); item.quantity =
		 * input.nextInt();
		 * 
		 * System.out.println("Dados do produto:\n"+item);
		 * 
		 * System.out.
		 * println("Qual a entrada desse item deseja fazer no estoque (inteiro):");
		 * item.addProducts(input.nextInt());
		 * System.out.println("Dados do produto:\n"+item); System.out.
		 * println("Qual a sa�da desse item deseja fazer no estoque (inteiro):");
		 * item.removeProducts(input.nextInt());
		 * System.out.println("Dados do produto:\n"+item); input.close();
		 */

		/*
		 * Triangle exercise //float a1,a2,b1,b2,c1,c2; double p1,p2; double
		 * area1,area2;
		 * 
		 * Triangle x = new Triangle(), y = new Triangle(); //Nao basta declarar, tem
		 * que instanciar com o new
		 * 
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the measures of triangle X in decimal:"); x.a =
		 * input.nextDouble(); x.b = input.nextDouble(); x.c = input.nextDouble();
		 * System.out.println("Enter the measures of triangle Y in decimal:"); y.a =
		 * input.nextDouble(); y.b = input.nextDouble(); y.c = input.nextDouble();
		 * 
		 * area1=x.area(); area2=y.area();
		 * 
		 * //area1=Math.sqrt(p1*(p1-x.a)*(p1-x.b)*(p1-x.c));
		 * //area2=Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));
		 * 
		 * System.out.println("Triangle X area: " + area1);
		 * System.out.println("Triangle Y area: " + area2);
		 * 
		 * if (area1>area2) System.out.println("Larger area: X"); else
		 * System.out.println("Larger area: Y");
		 * 
		 * input.close();
		 */

		/*
		 * section 1-7 System.out.println("hello world"); String product1 = "Computer",
		 * product2 = "Office desk";
		 * 
		 * int age = 30, code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0, price2 = 650.50, measure = 53.234567;
		 * 
		 * System.out.printf("Products:\n%s, which price is $ %.2f\n",product1,price1);
		 * System.out.printf("%s, which price is $ %.2f\n\n",product2,price2);
		 * System.out.printf("Record: %d years old, code %d and gender %c\n\n",age,code,
		 * gender); System.out.
		 * printf("Measure with 8 dec places: %.8f\nRounded (3-dec places): %.3f\n"
		 * ,measure,measure); //Default uses only 6 places.
		 * Locale.setDefault(Locale.US);
		 * System.out.printf("US dec point: %.3f",measure);
		 */

	}

}