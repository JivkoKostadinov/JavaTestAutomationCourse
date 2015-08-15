package tests.backend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.backend.AdminDashboard;
import pages.backend.AdminLogin;
import pages.backend.enums.Password;
import pages.backend.enums.Username;
import browser.Browser;

public class AdminLoginTests {

	
	@Before
	public void setUp(){
		Browser.init();
	}
	
	@Test
	public void successfulLogin(){
		AdminLogin.goTo();
		AdminLogin.logIn(Username.ADMIN, Password.ADMIN_PASSWORD);
		
		AdminDashboard.assertPageTitle("Dashboard");
	}
	
	@Test
	public void unsuccessfulLogin(){
		AdminLogin.goTo();
		AdminLogin.logIn(Username.NON_EXISING_USER, Password.NON_EXISTING_PASSWORD);
		
		AdminLogin.assertErrorMessage("No match for Username and/or Password.");
		
	}
	
	@After
	public void tearDown(){
		Browser.quit();
	}
}