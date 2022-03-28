package omegatree.bangundatar;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BujurSangkarTest {
	private BujurSangkar bujurSangkar;
	
	@BeforeEach
	public void setUp() {
		bujurSangkar = new BujurSangkar(10);
	}
	
	@Test
	@DisplayName("Konstruktor bujur sangkar.")
	public void testBujurSangkar() throws NoSuchFieldException, IllegalAccessException {
		final Field field = bujurSangkar.getClass().getDeclaredField("panjangSisi");
		field.setAccessible(true);
		
		assertEquals(10.0, field.get(bujurSangkar));
		assertEquals(4, bujurSangkar.getJumlahSisi());
	}
	
	@Test
	@DisplayName("Perhitungan luas bujur sangkar.")
	public void testHitungLuas() {
		final double result = bujurSangkar.hitungLuas();
		
		assertEquals(100, result);
	}
	
	@Test
	@DisplayName("Perhitungan keliling bujur sangkar.")
	public void testHitungKeliling() {
		final double result = bujurSangkar.hitungKeliling();
		
		assertEquals(40, result);
	}
	
	@Test
	@DisplayName("Get panjang sisi bujur sangkar.")
	public void testGetPanjangSisi() {
		final double result = bujurSangkar.getPanjangSisi();
		
		assertEquals(10, result);
	}
}
