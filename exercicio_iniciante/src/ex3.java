import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ent = new Scanner(System.in);
		
		double raio = ent.nextDouble();
		double Pi = 3.14159;
		
		double area = Pi * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		ent.close();

	}

}
