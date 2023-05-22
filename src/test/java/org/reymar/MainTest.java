package org.reymar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Map;
import java.util.function.BiConsumer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	static Map<BigInteger, BiConsumer<Double, Double>> opcionesMenu;

	@BeforeAll
	static void setup() {
		Menu menu = new Menu();
		opcionesMenu = menu.getOpcionesMenu();
	}

	@Test
	public void ejecutarSeleccionShouldReturn5() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		Main.ejecutarSeleccion(
				opcionesMenu, 2, 3, BigInteger.valueOf(1));

		String resultado = outputStream.toString().trim();
		System.setOut(System.out);

		assertEquals("El resultado de la suma es: 5.00", resultado);
	}
}