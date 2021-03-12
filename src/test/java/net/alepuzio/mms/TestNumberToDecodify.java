package net.alepuzio.mms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import net.alepuzio.mms.domain.EnumImage;
import net.alepuzio.mms.domain.NumberToDecodify;

import static org.junit.Assert.*;

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
	@Ignore //TODO find OOP solution of this case  
	public void testOneDigit(){
		String number = "3";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add(EnumImage.CENTO.image());
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
		assertTrue(false);
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
	public void test002436(){
		String number = "002436";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add(EnumImage.CENTO.image());
			expected.add(EnumImage.VENTIQUATTRO.image());
			expected.add(EnumImage.TRENTASEI.image());
			
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test00132436455861748795(){
		String number = "00132436455861748795";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add(EnumImage.CENTO.image());
			expected.add(EnumImage.TREDICI.image());
			expected.add(EnumImage.VENTIQUATTRO.image());
			expected.add(EnumImage.TRENTASEI.image());
			expected.add(EnumImage.QUARANTACINQUE.image());
			expected.add(EnumImage.CINQUANTAOTTO.image());
			expected.add(EnumImage.SESSANTUNO.image());
			expected.add(EnumImage.SETTANTAQUATTRO.image());
			expected.add(EnumImage.OTTANTASETTE.image());
			expected.add(EnumImage.NOVANTACINQUE.image());
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test12345678900087654321(){
		String number = "12345678900987654321";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add(EnumImage.DODICI.image());
			expected.add(EnumImage.TRENTAQUATTRO.image());
			expected.add(EnumImage.CINQUANTASEI.image());
			expected.add(EnumImage.SETTANTOTTO.image());
			expected.add(EnumImage.NOVANTA.image());
			expected.add("Undefined number[9]");
			
			expected.add(EnumImage.OTTANTASETTE.image());
			expected.add(EnumImage.SESSANTACINQUE.image());
			expected.add(EnumImage.QUARANTATRE.image());
			expected.add(EnumImage.VENTIUNO.image());
			
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

	
	@Test
	public void testDecodifySingleUnkownNumber(){
		String number = "09";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add("Undefined number[9]");
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void testDecodifyUnkownAndKnownNumbers(){
		String number = "0888";
		instance = new NumberToDecodify(number);
		try{
			List<String> expected = new ArrayList<>();
			expected.add("Undefined number[8]");
			expected.add(EnumImage.OTTANTOTTO.image());
			List<String> actual = instance.listImage();
			assertEquals(expected, actual);;
		} catch(Exception e) {
			assertFalse(true);
		}
	}

}

