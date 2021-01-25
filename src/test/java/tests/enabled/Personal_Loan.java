package tests.enabled;

import org.testng.annotations.Test;

public class Personal_Loan {

	@Test
	public void TC_WebLogin() {
		System.out.println("Login - Selenium");
	}

	// We know that there is a bug in Sign in using mobile app,
	// That's why skipping this intentionally
	@Test(enabled = false)
	public void TC_MobileLogin() {
		System.out.println("Login - Appium");

	}

	@Test
	public void TC_APILogin() {
		System.out.println("Login - RestAssured");
		// Assert.fail("FAiled intentionally");
	}

}
