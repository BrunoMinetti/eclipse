package operadores_atribuicao;

import java.util.Locale;
import java.util.Scanner;

public class condicional_ternaria {

	public static void main(String[] args) {
		// Expressão condicional ternária
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
//		double desconto;
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		}
//		else {
//			desconto = preco * 0.05;
//		}
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O valor do desconto é de R$ %.2f%n", desconto);
		sc.close();
	}

}
