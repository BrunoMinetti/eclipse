package estruturas_condicionais;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int a = ent.nextInt();
		int b = ent.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO sao MULTIPLOS");
		}
		ent.close();
	}

}
