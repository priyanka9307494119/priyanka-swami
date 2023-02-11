package testNGProjects.maventest;

import static org.junit.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppTest extends BaseTestClass{
	@Test
	public void loginTestCase() throws Throwable{
		login.lofinfunctionality();
		Reporter.log("maven example",true);
			assertTrue(true);
			
		}
	@Test
	public void logout() {
		Reporter.log("Application logout");
		assertTrue(true);
}
}


