package application;

import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //Triangle exercise //float a1,a2,b1,b2,c1,c2; double p1,p2; 
		  double area1,area2;
		  
		  Triangle x = new Triangle(), y = new Triangle(); 
		  //Nao basta declarar, tem que instanciar com o new
		  
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter the measures of triangle X in decimal:"); x.a =
		  input.nextDouble(); x.b = input.nextDouble(); x.c = input.nextDouble();
		  System.out.println("Enter the measures of triangle Y in decimal:"); y.a =
		  input.nextDouble(); y.b = input.nextDouble(); y.c = input.nextDouble();
		  
		  area1=x.area(); area2=y.area();
		  
		  //area1=Math.sqrt(p1*(p1-x.a)*(p1-x.b)*(p1-x.c));
		  //area2=Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));
		  
		  System.out.println("Triangle X area: " + area1);
		  System.out.println("Triangle Y area: " + area2);
		  
		  if (area1>area2) System.out.println("Larger area: X"); else
		  System.out.println("Larger area: Y");
		  
		  input.close();
		 
	}

}
