package omegatree.poligon;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PoligonTest {
	private Poligon poligon;
	
	@BeforeEach
	public void setUp() {
		poligon = new Poligon();
	}
	
	@Test
	@DisplayName("Konstruktor poligon.")
	public void testPoligon() throws NoSuchFieldException, IllegalAccessException {
		final Field field = poligon.getClass().getDeclaredField("jumlahSisi");
		field.setAccessible(true);
		
		assertEquals(0, field.get(poligon));
	}
	
	@Test
	@DisplayName("Set jumlah sisi poligon.")
	public void testSetJumlahSisi() throws NoSuchFieldException, IllegalAccessException {		
		poligon.setJumlahSisi(5);
		
		final Field field = poligon.getClass().getDeclaredField("jumlahSisi");
		field.setAccessible(true);
		assertEquals(5, field.get(poligon));
	}
	
	@Test
	@DisplayName("Get jumlah sisi poligon.")
	public void testGetJumlahSisi() throws NoSuchFieldException, IllegalAccessException {
		final Field field = poligon.getClass().getDeclaredField("jumlahSisi");
		field.setAccessible(true);
		field.set(poligon, 2);
		
		final int result = poligon.getJumlahSisi();
		
		assertEquals(2, result);
	}
}
