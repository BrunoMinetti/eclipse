package estruturas_repetitivas;

import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {
		// URI1067 FOR
		Scanner ent = new Scanner(System.in);
		
		int x = ent.nextInt();
		
		for(int i=1;i<=x;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		ent.close();
	}

}
