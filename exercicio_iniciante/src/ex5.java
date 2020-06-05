import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ent = new Scanner(System.in);
		
		int number = ent.nextInt();
		int hours = ent.nextInt();
		double value = ent.nextDouble();
				
		double salary = hours * value;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		ent.close();

	}

}
