package estruturas_condicionais;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int h1 = ent.nextInt();
		int h2 = ent.nextInt();
		
		if (h2 > h1) {
			System.out.printf("O JOGO DUROU %d HORA(S)%n", (h2 - h1));
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)%n", (h2 - h1 + 24));
		}
		
		ent.close();
		

	}

}
