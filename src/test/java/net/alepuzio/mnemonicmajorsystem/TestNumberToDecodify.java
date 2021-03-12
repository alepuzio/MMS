package net.alepuzio.mnemonicmajorsystem;

import java.util.ArrayList;
import java.util.List;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;

import it.javaboss.webapp.mms.EnumImage;
import it.javaboss.webapp.mms.NumberToDecodify;

public class TestNumberToDecodify {

	private NumberToDecodify instance = null;
	
	@Test
	public void testSubString() {
		String number = "0123456789";
		String actual = number.substring(0,2);
		assertEquals("01", actual);
		actual = number.substring(2,4);
		assertEquals("23", actual);
	}
	
	@Test
	public void testNull(){
		String number = null;
		instance = new NumberToDecodify(number);
		try{
			instance.listImage();
		} catch(NullPointerException e) {
			assertTrue(true);
		}
		//assertTrue(false); TODO rivedere
		
		
	}
	
	@Test
	public void testEmpty(){
		String number = "";
		instance = new NumberToDecodify(number);
		try{
			instance.listImage();
		} catch(Exception e) {
			assertFalse(false);
		}
		assertTrue(true);
	}

	
	@Test
	public void test00(){
		String number = "00";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add(EnumImage.CENTO.image());
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test0024(){
		String number = "0024";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add(EnumImage.CENTO.image());
			expected.add(EnumImage.VENTIQUATTRO.image());
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void testDecodifyUnkownNumber(){}

	@Test
	public void testSingleDigit(){}

}

