import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ent = new Scanner(System.in);
		
		int A = ent.nextInt();
		int B = ent.nextInt();
		int C = ent.nextInt();
		int D = ent.nextInt();
		
		int Diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + Diferenca);
		
		ent.close();

	}

}
