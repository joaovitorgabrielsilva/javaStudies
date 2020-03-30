package application;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Product Exercise
		Scanner input = new Scanner(System.in);
		Product item = new Product();

		// Locale.setDefault(Locale.US);
		System.out.println("Realize o cadastro do produto no banco de dados");
		System.out.print("Insira o nome:");
		item.name = input.next();

		System.out.print("Insira o preço do item (use , como separador decimal):");
		item.price = input.nextDouble();
		System.out.print("Insira a quantidade (inteira) do item:");
		item.quantity = input.nextInt();

		System.out.println("Dados do produto:\n" + item);

		System.out.println("Qual a entrada desse item deseja fazer no estoque (inteiro):");
		item.addProducts(input.nextInt());
		System.out.println("Dados do produto:\n" + item);
		System.out.println("Qual a saída desse item deseja fazer no estoque (inteiro):");
		item.removeProducts(input.nextInt());
		System.out.println("Dados do produto:\n" + item);
		input.close();

	}

}
