package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramCSV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the full path of the .CSV file with the item data: ");
		String strPath = sc.nextLine();
		
		sc.close();
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath)))
		{
			String line = br.readLine();
			
			while(line != null)
			{
				String[] product = line.split(",");
				String name = product[0];
				double price = Double.parseDouble(product[1]);
				int quantity = Integer.parseInt(product[2]);
				//System.out.println("Name: " +name+" Price: "+price +" Qty: "+quantity);
				list.add(new Product(name,price,quantity));
				line = br.readLine();
			}
		
			File source = new File(strPath);
			boolean success = new File(source.getParent() + "\\out").mkdir();
			
			System.out.println("Directory " + source.getParent() + "\\out"  + " created successfully: "+success);;
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(source.getParent() + "\\out\\summary.csv")))
			{
				for (Product product : list)
				{
					bw.write(""+product);
					bw.newLine();
				}
			} catch (IOException e)
			{
			System.out.println("Error writing file: " + e.getMessage());
			}
		
		}catch (IOException e)
		{
			System.out.println("Error reading file: " + e.getMessage());
		}

	}
}
