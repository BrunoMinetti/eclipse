package entities;

public class Triangle {
	
	public double a, b, c, area, per;
	public String nome;
	
	public boolean condicaoExistencia() {
		if (Math.abs(b - c) < a && a < (b + c) && Math.abs(a - c) < b && b <( a + c) && Math.abs(a - b) < c && c < (a + b)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double perimeter() {
		per = a + b + c;
		return per;
	}
	
	public double area() {
		double p = (a + b + c)/2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}	
	
	
	
	public void showAreaTriangle () {
		System.out.printf(" Triangle %s area: %.4f%n", nome, area);
	}
	
	public void showPerimeterTriangle () {
		System.out.printf(" Triangle %s perimeter: %.4f%n", nome, (a+b+c));
	}
		
	public void triangleType() {
		if (a == b && a == c) {
			System.out.printf("the triangle %s is equilateral.%n", nome);
		}
		else if (a==b || a==c || c==b) {
			System.out.printf("the triangle %s is isosceles.%n", nome);
		}
		else if ((b*b == (a*a + c*c))||(c*c == (b*b + a*a))||(a*a == (b*b + c*c))) {
			System.out.printf("the triangle %s is retangle.%n", nome);
		}
		else {
			System.out.printf("the triangle %s is scalene.%n", nome);
		}
	}
}
