package application;

import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account Exercise
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
		
			
	}

}
