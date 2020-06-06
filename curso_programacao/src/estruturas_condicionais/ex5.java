package estruturas_condicionais;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		ent.close();
	}

}
