package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		double x = ent.nextDouble();
		double y = ent.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo X");
		}
		else if (y == 0) {
			System.out.println("Eixo Y");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
	}

}
