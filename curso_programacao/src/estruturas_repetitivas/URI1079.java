package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

	public static void main(String[] args) {
		// URI1079 FOR
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int N = ent.nextInt();
		
		for (int i=0; i<N; i++) {
		double a = ent.nextDouble();
		double b = ent.nextDouble();
		double c = ent.nextDouble();
		double media = (2*a + 3*b + 5*c)/10;
		System.out.printf("%.1f%n",media);
		
		}
		
		ent.close();
	}

}
