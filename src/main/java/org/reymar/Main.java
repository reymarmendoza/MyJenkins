package org.reymar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Seleccione la operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir");

			System.out.print("Opción: ");
			int opcion = scanner.nextInt();

			if (opcion == 5) {
				System.out.println("Gracias por usar la Calculadora.");
				scanner.close();
			}

			System.out.print("Ingrese el primer número: ");
			double numero1 = scanner.nextDouble();

			System.out.print("Ingrese el segundo número: ");
			double numero2 = scanner.nextDouble();


			double resultado;

			switch (opcion) {
				case 1:
					resultado = numero1 + numero2;
					System.out.println("El resultado de la suma es: " + resultado);
					break;
				case 2:
					resultado = numero1 - numero2;
					System.out.println("El resultado de la resta es: " + resultado);
					break;
				case 3:
					resultado = numero1 * numero2;
					System.out.println("El resultado de la multiplicación es: " + resultado);
					break;
				case 4:
					if (numero2 != 0) {
						resultado = numero1 / numero2;
						System.out.println("El resultado de la división es: " + resultado);
					} else System.out.println("Error: No se puede dividir entre cero.");
					break;
				default:
					System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
			}

			System.out.println();
		}
	}
}