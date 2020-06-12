package estruturas_repetitivas;

import java.util.Scanner;

public class ex01while {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int senhaValida = 2002;
		int senha = ent.nextInt();
		
		while (senha != senhaValida) {
			System.out.println("Senha Invalida");
			senha = ent.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		ent.close();
		

	}

}
