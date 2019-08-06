package stepDefLogin;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepBean.Loginbean;

public class Test {

	private WebDriver driver;
	private Loginbean loginbean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^User is on 'login' Page$")
	public void user_is_on_login_Page() throws Throwable {
	
		driver.get("D:\\Selenium Workspace\\RegistrationFormValidation\\login.html");
		
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginbean = new Loginbean(driver);

	}

	@When("^user enters invalid UserName$")
	public void user_enters_invalid_UserName() throws Throwable {
		loginbean.setUserName("");
		loginbean.setLoginButton();
		
		
	}

	@Then("^display 'Please Enter UserName'$")
	public void display_Please_Enter_UserName() throws Throwable {
		String expectedMessage="* Please enter userName.";
		String actualMessage=loginbean.getUsernameError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		loginbean.setUserName("SUMAN");
		loginbean.setPassword("");
		loginbean.setLoginButton();

	}

	@Then("^display 'Please Enter Password'$")
	public void display_Please_Enter_Password() throws Throwable {
		String expectedMessage="* Please enter password.";
		String actualMessage=loginbean.getPasswordError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	

	}

@When("^user enters invalid details$")
public void user_enters_invalid_details() throws Throwable {
	loginbean.setUserName("SUMAN");
	loginbean.setPassword("TCS");
	loginbean.setLoginButton();

}

@Then("^display 'Invalid Login Please try again'$")
public void display_Invalid_Login_Please_try_again() throws Throwable {
	String expectedMessage="Invalid login! Please try again!";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		loginbean.setUserName("SUMAN");
		loginbean.setPassword("CAPG");
		loginbean.setLoginButton();
	
	}


	@Then("^display 'Registration' Page$")
	public void display_Registration_Page() throws Throwable {
		driver.get("D:\\Selenium Workspace\\RegistrationFormValidation\\Form.html");
	//	driver.close();
	}

}
