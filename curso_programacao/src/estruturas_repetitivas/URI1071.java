package estruturas_repetitivas;

import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {
		// URI1071
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		
		if (y<x) {
			int z = x;
			x = y;
			y = z;
		}
		
		for (int i=x+1; i<y; i++) {
			if (i%2!=0) {
				soma +=i;
			}
		
		}
		System.out.println(soma);
		sc.close();

	}

}
