package omegatree.bangundatar;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TrapesiumTest {
	private Trapesium trapesium;

	@BeforeEach
	void setUp() throws Exception {
		trapesium = new Trapesium(4, 6, 5);
	}

	@Test
	@DisplayName("Konstruktor trapesium.")
	void testTrapesium() throws NoSuchFieldException, IllegalAccessException {
		final Field field1 = trapesium.getClass().getDeclaredField("panjangSisiAtas");
		final Field field2 = trapesium.getClass().getDeclaredField("panjangSisiBawah");
		final Field field3 = trapesium.getClass().getDeclaredField("tinggi");
		field1.setAccessible(true); field2.setAccessible(true); field3.setAccessible(true);
		
		assertEquals(4.0, field1.get(trapesium));
		assertEquals(6.0, field2.get(trapesium));
		assertEquals(5.0, field3.get(trapesium));
		assertEquals(4, trapesium.getJumlahSisi());
	}

	@Test
	@DisplayName("Perhitungan luas trapesium.")
	void testHitungLuas() {
		final double result = trapesium.hitungLuas();
		
		assertEquals(25, result);
	}

	@Test
	@DisplayName("Info panjang sisi atas trapesium.")
	void testGetPanjangSisiAtas() {
		final double result = trapesium.getPanjangSisiAtas();
		
		assertEquals(4, result);
	}

	@Test
	@DisplayName("Info panjang sisi bawah trapesium.")
	void testGetPanjangSisiBawah() {
		final double result = trapesium.getPanjangSisiBawah();
		
		assertEquals(6, result);
	}

	@Test
	@DisplayName("Info tinggi trapesium.")
	void testGetTinggi() {
		final double result = trapesium.getTinggi();
		
		assertEquals(5, result);
	}

}
