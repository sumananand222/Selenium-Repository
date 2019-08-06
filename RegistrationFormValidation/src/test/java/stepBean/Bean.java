package stepBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bean {

	WebDriver driver;
	
	@FindBy(name="txtUName")
	@CacheLookup
	WebElement name;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement fname;

	@FindBy(name="txtLN")
	@CacheLookup
	WebElement lname;
	
	@FindBy(name="gender")
	@CacheLookup
	WebElement gender;
	
	@FindBy(name="DtOB")
	@CacheLookup
	WebElement dob;
	
	public WebElement getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender=driver.findElement(By.id("rbMale"));
		this.gender.click();
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob.sendKeys(dob);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public WebElement getHobby() {
		return hobby;
	}

	public void setHobby() {
		this.hobby.click();
	}


	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="City")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(name="chkHobbies")
	@CacheLookup
	WebElement hobby;
	
	@FindBy(name="txtPwd")
	@CacheLookup
	WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass.sendKeys(pass);
	}

	@FindBy(name="submit")
	@CacheLookup
	WebElement loginButton;

	public Bean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(String name) {
		this.name.sendKeys(name);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		this.loginButton.click();
	}
}
