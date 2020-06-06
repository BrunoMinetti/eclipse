package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int cod = ent.nextInt();
		int qty = ent.nextInt();
		
		if (cod == 1) {
			System.out.printf("Total: R$ %.2f%n",(4.0 * qty));
		}
		else if (cod == 2) {
			System.out.printf("Total: R$ %.2f%n",(4.5 * qty));
		}
		else if (cod == 3) {
			System.out.printf("Total: R$ %.2f%n",(5.0 * qty));
		}
		else if (cod == 4) {
			System.out.printf("Total: R$ %.2f%n",(2.0 * qty));
		}
		else if (cod == 5) {
			System.out.printf("Total: R$ %.2f%n",(1.5 * qty));
		}
		else {
			System.out.println("Código não cadastrado");
		}
		ent.close();
	}

}
