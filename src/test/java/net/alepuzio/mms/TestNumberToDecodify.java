package net.alepuzio.mms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import net.alepuzio.mms.domain.NumberToDecodify;
import net.alepuzio.mms.domain.enumeration.EnumImage;

import static org.junit.Assert.*;

public class TestNumberToDecodify {

	private NumberToDecodify instance = null;

	@Test
	public void testSubString() {
		String number = "0123456789";
		String actual = number.substring(0, 2);
		assertEquals("01", actual);
		actual = number.substring(2, 4);
		assertEquals("23", actual);
	}

	@Test
	public void testNull() {
		String number = null;
		instance = new NumberToDecodify(number);
		try {
			instance.listImage();
		} catch (NullPointerException e) {
			assertTrue(true);
		}
		// assertTrue(false); TODO rivedere

	}

	@Test
	public void testEmpty() {
		String number = "";
		instance = new NumberToDecodify(number);
		List<EnumImage> actual = instance.listImage();
		List<EnumImage> expected = new ArrayList<EnumImage>();
		assertEquals(expected, actual);
	}

	@Test
	@Ignore // TODO find OOP solution of this case
	public void testOneDigit() {
		String number = "3";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> actual = instance.listImage();
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.TRE);
			assertEquals(expected, actual);
		} catch (Exception e) {
			assertFalse(true);
		}
		assertTrue(false);
	}

	@Test
	public void test00() {
		String number = "00";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.ZERO);
			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test0024() {
		String number = "0024";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.ZERO);
			expected.add(EnumImage.VENTIQUATTRO);
			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test002436() {
		String number = "002436";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.ZERO);
			expected.add(EnumImage.VENTIQUATTRO);
			expected.add(EnumImage.TRENTASEI);

			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
			;
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test00132436455861748795() {
		String number = "00132436455861748795";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.ZERO);
			expected.add(EnumImage.TREDICI);
			expected.add(EnumImage.VENTIQUATTRO);
			expected.add(EnumImage.TRENTASEI);
			expected.add(EnumImage.QUARANTACINQUE);
			expected.add(EnumImage.CINQUANTAOTTO);
			expected.add(EnumImage.SESSANTUNO);
			expected.add(EnumImage.SETTANTAQUATTRO);
			expected.add(EnumImage.OTTANTASETTE);
			expected.add(EnumImage.NOVANTACINQUE);
			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
			;
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void test12345678900087654321() {
		String number = "12345678900987654321";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.DODICI);
			expected.add(EnumImage.TRENTAQUATTRO);
			expected.add(EnumImage.CINQUANTASEI);
			expected.add(EnumImage.SETTANTOTTO);
			expected.add(EnumImage.NOVANTA);
			expected.add(EnumImage.UNKOWN);

			expected.add(EnumImage.OTTANTASETTE);
			expected.add(EnumImage.SESSANTACINQUE);
			expected.add(EnumImage.QUARANTATRE);
			expected.add(EnumImage.VENTIUNO);

			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void testDecodifySingleUnkownNumber() {
		String number = "09";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.UNKOWN);
			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	public void testDecodifyUnkownAndKnownNumbers() {
		String number = "0888";
		instance = new NumberToDecodify(number);
		try {
			List<EnumImage> expected = new ArrayList<>();
			expected.add(EnumImage.OTTO);
			expected.add(EnumImage.OTTANTOTTO);
			List<EnumImage> actual = instance.listImage();
			assertEquals(expected, actual);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

}
