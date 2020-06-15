package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		
		for (int i=0; i<n; i++) {
			int x = ent.nextInt();
			int y = ent.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		ent.close();		
	}

}
