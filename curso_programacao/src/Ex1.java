import java.util.Locale;

public class Ex1 {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);	
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("Resultado = %.2f metros%n", x);
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
