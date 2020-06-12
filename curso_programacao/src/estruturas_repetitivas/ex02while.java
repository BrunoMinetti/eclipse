package estruturas_repetitivas;

import java.util.Scanner;

public class ex02while {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int x = ent.nextInt();
		int y = ent.nextInt();
		
		while ( x != 0 && y != 0) {
			if ( x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if ( x < 0 && y > 0){
				System.out.println("segundo");
			}
			else if ( x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = ent.nextInt();
			y = ent.nextInt();
		}
						
		ent.close();

	}

}
