package com.eduocio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EduyOcioApplicationTests {

	@Test
	void crearUsuarioTest() {
		String cadena = "";
		String banco = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMÑOPQRSTUVWXYZ1234567890";

		for (int x = 0; x < 8; x++) {

			int index = (int) (Math.random() * 64) + 1;
			System.err.println(index);
			char caracteraleatorio = banco.charAt(index);
			cadena += caracteraleatorio;

		}
		System.out.println(cadena);
	}
}
