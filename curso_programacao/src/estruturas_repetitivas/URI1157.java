package estruturas_repetitivas;

import java.util.Scanner;

public class URI1157 {

	public static void main(String[] args) {
		// URI1157 FOR
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		
		for (int i = 1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		ent.close();
	}

}
