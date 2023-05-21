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

			Map<BigInteger, BiConsumer<Double, Double>> opcionesMenu = new HashMap<>();

			opcionesMenu.put(ALLOWED_OPTIONS_SELECTION.VALUE1.getValue(), Main::sumar);
			opcionesMenu.put(ALLOWED_OPTIONS_SELECTION.VALUE2.getValue(), Main::restar);
			opcionesMenu.put(ALLOWED_OPTIONS_SELECTION.VALUE3.getValue(), Main::multiplicar);
			opcionesMenu.put(ALLOWED_OPTIONS_SELECTION.VALUE4.getValue(), Main::dividir);
			
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

			opcionesMenu
					.getOrDefault(opcion, Main::noEncontrado)
					.accept(numero1, numero2);
		}
	}

	private static BigInteger getBigInteger(int num) {
		return BigInteger.valueOf(num);
	}

	private static void sumar(Double a, Double b) {
		System.out.printf("El resultado de la suma es: %.2f\n\n", a + b);
	}

	private static void restar(Double a, Double b) {
		System.out.printf("El resultado de la resta es: %.2f\n\n", a - b);
	}

	private static void multiplicar(Double a, Double b) {
		System.out.printf("El resultado de la multiplicacion es: %.2f\n\n", a * b);
	}

	private static void dividir(Double a, Double b) {
		System.out.printf("El resultado de la division es: %.2f\n\n", a / b);
	}

	private static void noEncontrado(Double a, Double b) {
		System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	}
}