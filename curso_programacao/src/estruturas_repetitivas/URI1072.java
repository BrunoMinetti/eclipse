package estruturas_repetitivas;

import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
		// URI1072 FOR
		Scanner ent = new Scanner(System.in);
		 int N = ent.nextInt();
		 int IN = 0, OUT = 0;
		 
		 for (int i = 0; i<N; i++) {
		 
		 int x = ent.nextInt();
		 if (x>=10 && x<=20) {
			 IN += 1;
		 	}
		 else {
			 OUT += 1;
		 	}
		 }

		System.out.println(IN + " in");
		System.out.println(OUT + " out");
		ent.close();
	}

}
