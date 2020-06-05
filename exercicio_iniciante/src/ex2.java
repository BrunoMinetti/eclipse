import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ent = new Scanner(System.in);
		
		int A = ent.nextInt();
		int B = ent.nextInt();
		
		int Soma = A + B;
		
		System.out.println("SOMA = " + Soma);
		
		ent.close();

	}

}
