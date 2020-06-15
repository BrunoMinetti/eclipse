package estruturas_repetitivas;

import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		// URI 1153 FOR
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		int fatorial=1;
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial);
				
		ent.close();
	}

}
