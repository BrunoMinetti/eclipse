package estruturas_repetitivas;

import java.util.Scanner;

public class ex1for {

	public static void main(String[] args) {
		// URI1078
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = N * i;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
	}

}
