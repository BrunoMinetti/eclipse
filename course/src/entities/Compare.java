package entities;

public class Compare {
	public double valor1, valor2;
	public String nome1, nome2;
	
	public void showMajor () {
		if (valor1 > valor2) {
			System.out.printf("Larger area: %s%n", nome1);
		}
		else {
			System.out.printf("Larger area: %s%n", nome2);
		}
	}

	public void showMinor () {
		if (valor1 < valor2) {
			System.out.printf("Smaller area: %s%n", nome1);
		}
		else {
			System.out.printf("Smaller area: %s%n", nome2);
		}
	}
	
}
