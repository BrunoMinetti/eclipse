package estruturas_condicionais;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		
		if (n > 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		ent.close();
	}

}
