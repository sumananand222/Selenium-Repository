package testingDemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelLoginPageFactory;

public class TestingStepDef {

	private WebDriver driver;
	HotelLoginPageFactory loginPageFactory;

	@Before
	public void setUp() {
		String exePath = 
				"D:\\chromedriver_win32\\chromedriver.exe";
				
		 System.setProperty("webdriver.chrome.driver", exePath);
			//WebDriver driver = new ChromeDriver();
			
		driver= new ChromeDriver();
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	driver.get("D:\\Selenium Workspace\\BDDCaseStudyFinal\\login.html");
		
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPageFactory = new HotelLoginPageFactory(driver);

		
	}

	@When("^user enters \"(.*?)\" as username and \"(.*?)\" as password$")
	public void user_enters_as_username_and_as_password(String uname, String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPageFactory.setUserName(uname);
		loginPageFactory.setPassword(pwd);
		loginPageFactory.setLoginButton();
	
		
	}

	@Then("^displays hotelBooking page$")
	public void displays_hotelBooking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("D:\\Selenium Workspace\\BDDCaseStudyFinal\\hotelbooking.html");
	}

	@Then("^displays 'Invalid username password '$")
	public void displays_Invalid_username_password() throws Throwable {
		String expectedMessage="Invalid login! Please try again!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
}
