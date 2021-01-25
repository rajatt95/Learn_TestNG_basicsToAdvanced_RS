package tests.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreditCard {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass - Credit Card");
	}

	@Test
	public void test() {
		System.out.println("@Test - Credit Card");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass - Credit Card");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest - Credit Card");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("@AfterTest - Credit Card");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite - Credit Card");
		System.out.println("---------------------");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("---------------------");
		System.out.println("@AfterSuite - Credit Card");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
	}
}
