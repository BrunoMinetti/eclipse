package estruturas_repetitivas;

import java.util.Scanner;

public class ex1113 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int x = ent.nextInt();
		int y = ent.nextInt();
		
		while ( x != y) {
			if (x>y) {
			System.out.println("Decrescente");
			}
			else {
				System.out.println("Crescente");
			}
			x = ent.nextInt();
			y = ent.nextInt();
		}
		
		ent.close();

	}

}
