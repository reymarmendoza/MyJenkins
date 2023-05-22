package org.reymar;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		Map<BigInteger, BiConsumer<Double, Double>> opcionesMenu = menu.getOpcionesMenu();

		while (true) {
			System.out.println("Seleccione la operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir");

			BigInteger opcion = getBigInteger(0);
			double numero1 = 0;
			double numero2 = 0;

			try {
				System.out.print("Opción: ");
				opcion = scanner.nextBigInteger();
	
				if (opcion.equals(getBigInteger(5))) {
					System.out.println("Gracias por usar la Calculadora.");
					scanner.close();
					break;
				}
	
				System.out.print("Ingrese el primer número: ");
				numero1 = scanner.nextDouble();
				System.out.print("Ingrese el segundo número: ");
				numero2 = scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error: Entrada inválida. Asegúrate de ingresar números correctamente.");
				scanner.nextLine();
			}

			ejecutarSeleccion(opcionesMenu, numero1, numero2, opcion);
		}
	}

	public static void ejecutarSeleccion(
			Map<BigInteger, BiConsumer<Double, Double>> opcionesMenu,
			double numero1,
			double numero2,
			BigInteger opcion
	) {
		opcionesMenu
				.getOrDefault(opcion, Main::noEncontrado)
				.accept(numero1, numero2);
	}

	private static BigInteger getBigInteger(int num) {
		return BigInteger.valueOf(num);
	}

	public static void noEncontrado(Double a, Double b) {
		System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	}
}