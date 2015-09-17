package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void testMyInteger() {
		MyInteger myint = new MyInteger(7);
		MyInteger myint2 = new MyInteger(10);
		char[] it = {'3','4','5','6'};
		
		assertEquals(false,myint.equals(8));
		assertEquals(false,myint.equals(myint2));
		assertEquals(7,myint.getValue());
		assertEquals(false,myint.isEven());
		assertEquals(true,myint.isOdd());
		assertEquals(true,myint.isPrime());
		assertEquals(true,myint.isEven(-200));
		assertEquals(true,myint.isEven(myint2));
		assertEquals(false,myint.isOdd(78));
		assertEquals(false,myint.isOdd(myint2));
		assertEquals(false,myint.isPrime(256));
		assertEquals(true,myint.isPrime(41));
		assertEquals(false,myint.isPrime(myint2));
		assertEquals(3456,myint.parseInt(it));
		assertEquals(98654,myint.parseInt("98654"));
	}
}