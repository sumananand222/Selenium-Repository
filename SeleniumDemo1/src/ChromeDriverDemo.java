import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		String exePath = "D:\\chromedriver_win32\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium Workspace/1.html");
//		WebElement element = driver.findElement(By.id("uName"));
//		WebElement element = driver.findElement(By.name("username"));
		WebElement element = driver.findElement(By.cssSelector("input[type='text'][id='uName']"));
		element.sendKeys("Hello All");
		Thread.sleep(10000);
		driver.quit();
	}

}
