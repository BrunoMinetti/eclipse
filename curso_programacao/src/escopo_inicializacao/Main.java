package escopo_inicializacao;

public class Main {

	public static void main(String[] args) {
		// A vari�vel precisa ser inicializada, para n�o apresentar erro de compila��o.  
		
		double price = 400.00;
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
