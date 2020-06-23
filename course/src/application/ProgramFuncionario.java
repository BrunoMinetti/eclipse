package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee_;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee_ func = new Employee_();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + func);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		func.increaseSalary(percent);
		System.out.println();
		System.out.println("Updated data: " + func.toString());
		
		sc.close();

	}

}
