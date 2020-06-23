package application;

import java.util.Scanner;

import entities.Student;

public class Pensao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Student[] pensao = new Student[10];
		
		for (int i = 1; i <= n ; i++) {
			
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			pensao[room] = new Student(name, email);
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < pensao.length; i++) {
			if (pensao[i] != null) {
				System.out.println(i + ": " + pensao[i]);
			}
		}
		sc.close();
	}

}
