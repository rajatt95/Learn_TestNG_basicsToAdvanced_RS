package tests.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreditCard_VISA {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---------------------");
		System.out.println("@BeforeMethod - Credit Card");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("---------------------");
		System.out.println("@AfterMethod - Credit Card");
	}

	@Test
	public void TC_CreditCard_VISA_1() {
		System.out.println("Credit card - VISA 1");
	}

	@Test
	public void TC_CreditCard_VISA_2() {
		System.out.println("Credit card - VISA 2");
	}

}
