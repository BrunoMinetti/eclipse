package entities;

public class Triangle {
	
	public double a, b, c, area;
	public String nome;
	
	public double area() {
		double p = (a + b + c)/2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}	
	public void showAreaTriangle () {
		System.out.printf(" Triangle %s area: %.4f%n", nome, area);
	}
	public void equilateral() {
		if (a == b && a == c) {
			System.out.printf("the triangle %s is equilateral.%n", nome);
		}
		else {
			System.out.printf("the triangle %s is not equilateral.%n", nome);
		}
	}
	public void retangle() {
		if ((b*b == (a*a + c*c))||(c*c == (b*b + a*a))||(a*a == (b*b + c*c))) {
			System.out.printf("the triangle %s is retangle.%n", nome);
		}
		else {
			System.out.printf("the triangle %s is not retangle.%n", nome);
		}
	}
}
