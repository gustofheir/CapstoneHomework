package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ATMTest {
	
	private ATM atm;

	@Before
	public void setUp() throws Exception {
		atm = new ATM(10);
		
	}

	@After
	public void tearDown() throws Exception {
		atm = null;
	}


	@Test 
	public void testDeposit() {
		double amount = 1.0;
		double expectedValue = amount + 10;
		
		atm.deposit(amount);
		double test = atm.getBalance();
		assertEquals(expectedValue, test,0);
	}
	
	@Test
	public void testException(){
		
	}
	

	@Test
	public void testWithdraw() {
		double amount = 10.0;
		atm.deposit(5);
		
		atm.withdraw(amount);
		double test = atm.getBalance();
		assertEquals(5.0, test, 0);
	}

}
