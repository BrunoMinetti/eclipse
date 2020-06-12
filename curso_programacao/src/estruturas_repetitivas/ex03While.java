package estruturas_repetitivas;

import java.util.Scanner;

public class ex03While {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int cod = ent.nextInt();
		int Alcool =0, Gasolina = 0, Diesel = 0;
		
		while (cod != 4) {
			if (cod == 1) {
				Alcool += 1; 
			}
			else if (cod == 2) {
				Gasolina +=1;
			}
			else if (cod == 3) {
				Diesel +=1;
			}
			cod = ent.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);

	}

}
