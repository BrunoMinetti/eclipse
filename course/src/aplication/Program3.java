package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double d = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double q = sc.nextDouble();
		
		double r = CurrencyConverter.dollarToReal(d, q);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", r);

	}

}
