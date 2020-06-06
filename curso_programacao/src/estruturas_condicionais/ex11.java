package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		double renda = ent.nextDouble();
		
		if (renda <= 2000.0) {
			System.out.println("Isento");
		}
		else if (renda <= 3000.0) {
			double imposto = (renda - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else if (renda <= 4500.0) {
			double imposto = (renda - 3000.0) * 0.18 + 80.0;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			double imposto = (renda - 4500.0) * 0.28 + 350.0;
			System.out.printf("R$ %.2f%n", imposto);
		}			
		ent.close();
	}

}
