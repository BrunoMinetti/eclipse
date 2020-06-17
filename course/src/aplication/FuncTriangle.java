package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Compare;
import entities.Triangle;

public class FuncTriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		Compare compare = new Compare();
				
		System.out.println("Enter the measures of first triangle: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		x.nome = sc.next();
		
		System.out.println("Enter the measures of second triangle: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		y.nome = sc.next();
		
		compare.nome1 = x.nome;
		compare.valor1 = x.area();
		compare.nome2 = y.nome;
		compare.valor2 = y.area();
		
		x.showAreaTriangle();
		y.showAreaTriangle();
		
		x.equilateral();
		y.equilateral();
		
		x.retangle();
		y.retangle();
		
		compare.showMajor();
		compare.showMinor();
		
		sc.close();
	}
}
