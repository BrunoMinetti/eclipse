import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ent = new Scanner(System.in);
		
		int P1 = ent.nextInt();
		int N1 = ent.nextInt();
		double V1 = ent.nextDouble();
		
		int P2 = ent.nextInt();
		int N2 = ent.nextInt();
		double V2 = ent.nextDouble();
		
		double valor = (N1 * V1 + N2 * V2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,valor);
		
		ent.close();

	}

}
