package omegatree.bangundatar;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersegiPanjangTest {
	private PersegiPanjang persegiPanjang;

	@BeforeEach
	public void setUp() throws Exception {
		persegiPanjang = new PersegiPanjang(8, 10);
	}
	
	@Test
	@DisplayName("Konstruktor persegi panjang.")
	public void testPersegiPanjang() throws NoSuchFieldException, IllegalAccessException {
		final Field field1 = persegiPanjang.getClass().getDeclaredField("panjang");
		final Field field2 = persegiPanjang.getClass().getDeclaredField("lebar");
		field1.setAccessible(true); field2.setAccessible(true);
		
		assertEquals(8.0, field1.get(persegiPanjang));
		assertEquals(10.0, field2.get(persegiPanjang));
		assertEquals(4, persegiPanjang.getJumlahSisi());
	}

	@Test
	@DisplayName("Perhitungan luas persegi panjang.")
	void testHitungLuas() {
		final double result = persegiPanjang.hitungLuas();
		
		assertEquals(80, result);
	}
	
	@Test
	@DisplayName("Perhitungan keliling persegi panjang.")
	void testHitungKeliling() {
		final double result = persegiPanjang.hitungKeliling();
		
		assertEquals(36, result);
	}

	@Test
	@DisplayName("Info panjang sisi persegi panjang.")
	void testGetPanjang() {
		final double result = persegiPanjang.getPanjang();
		
		assertEquals(8, result);
	}

	@Test
	@DisplayName("Info lebar sisi persegi panjang.")
	void testGetLebar() {
		final double result = persegiPanjang.getLebar();
		
		assertEquals(10, result);
	}
}
