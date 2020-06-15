package estruturas_repetitivas;

import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {
		// URI1143 FOR
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		
		for (int i=1; i<=n; i++) {
			int q = i*i;
			int c = q*i;
			System.out.println(i + " " + q + " " + c);
		}
		
		ent.close();
	}

}
