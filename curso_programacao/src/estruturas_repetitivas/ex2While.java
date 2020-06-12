package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ex2While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
				
		int idade = ent.nextInt();
		double resultado = 0;
		int cont = 0;
		
		if (idade < 0) {
			System.out.println("impossível calcular");
		}
		else {
			while (idade > 0) {
				cont += 1;
				resultado += idade;
				idade = ent.nextInt();
			}
			resultado /= cont;
			System.out.printf("%.2f%n",resultado);	
		}
		
		ent.close();

	}

}
