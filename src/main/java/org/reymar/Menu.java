package org.reymar;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Menu {
	private Map<BigInteger, BiConsumer<Double, Double>> opcionesMenu = new HashMap<>();

	public Menu() {
		this.opcionesMenu
				.put(ALLOWED_OPTIONS_SELECTION.VALUE1.getValue(), Menu::sumar);
		this.opcionesMenu
				.put(ALLOWED_OPTIONS_SELECTION.VALUE2.getValue(), Menu::restar);
		this.opcionesMenu
				.put(ALLOWED_OPTIONS_SELECTION.VALUE3.getValue(), Menu::multiplicar);
		this.opcionesMenu
				.put(ALLOWED_OPTIONS_SELECTION.VALUE4.getValue(), Menu::dividir);
	}

	public Map<BigInteger, BiConsumer<Double, Double>> getOpcionesMenu() {
		return opcionesMenu;
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

}
