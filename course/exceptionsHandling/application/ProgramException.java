package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Position! ");
		}
		catch (InputMismatchException e){
			System.out.println("This is not a number! ");
		}
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		try {
			double r = n/m;
			System.out.println(r);
		}
		catch (ArithmeticException e) {
			System.out.println("Divisão impossível!");
		}
		
		
		
		System.out.println("End of program");
		
		sc.close();
	}

}
