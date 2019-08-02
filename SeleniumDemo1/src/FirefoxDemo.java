import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		 driver.get("file:///D:/Selenium Workspace/1.html");
		 WebElement element = driver.findElement(By.id("uName"));
		 element.sendKeys("Using Firefox");
	}

}
