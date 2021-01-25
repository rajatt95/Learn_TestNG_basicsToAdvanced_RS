package tests.timeOut;

import org.testng.annotations.Test;

public class Personal_Loan {

	@Test(timeOut = 4000)
	public void TC_APILogin() {
		System.out.println("Login - RestAssured");
		// Assert.fail("FAiled intentionally");
	}

}
