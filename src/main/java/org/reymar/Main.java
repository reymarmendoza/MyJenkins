package org.reymar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Ingrese el primer número: ");
			double numero1 = scanner.nextDouble();

			System.out.print("Ingrese el segundo número: ");
			double numero2 = scanner.nextDouble();

			System.out.println("Seleccione la operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir");

			System.out.print("Opción: ");
			int opcion = scanner.nextInt();

			double resultado;
		}
	}
}