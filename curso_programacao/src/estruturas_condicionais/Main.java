package estruturas_condicionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Express�es Comparativas
		// Express�es L�gicas
		// Estrutura Condicional Simples
		// Estrutura Condicional Composta
		Scanner sc = new Scanner(System.in);
		int horas;
		
		System.out.println("Quantas Horas?");
		horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia");
		}
		else if (horas < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");		
		}
		
		sc.close();
	}

}
