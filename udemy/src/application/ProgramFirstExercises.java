package application;

import java.util.Locale;

public class ProgramFirstExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// section 1-7
		System.out.println("hello world");
		String product1 = "Computer", product2 = "Office desk";

		int age = 30, code = 5290;
		char gender = 'F';

		double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

		System.out.printf("Products:\n%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender %c\n\n", age, code, gender);
		System.out.printf("Measure with 8 dec places: %.8f\nRounded (3-dec places): %.3f\n", measure, measure); // Default
																												// uses
																												// only
																												// 6
																												// places.
		Locale.setDefault(Locale.US);
		System.out.printf("US dec point: %.3f", measure);

	}

}
