import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ent = new Scanner(System.in);
		
		double A = ent.nextDouble();
		double B = ent.nextDouble();
		double C = ent.nextDouble();
		double pi = 3.14159;
		
		double triangulo = A * C / 2;
		double circulo = Math.pow(C, 2) * pi;
		double trapezio = (A + B) * C / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n" , triangulo);
		System.out.printf("CIRCULO: %.3f%n" , circulo);
		System.out.printf("TRAPEZIO: %.3f%n" , trapezio);
		System.out.printf("QUADRADO: %.3f%n" , quadrado);
		System.out.printf("RETANGULO: %.3f%n" , retangulo);
		
		ent.close();

	}

}
