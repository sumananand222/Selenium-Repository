import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium Workspace/2.html");
		WebElement element = driver.findElement(By.id("eid"));
		element.sendKeys("102");
		element = driver.findElement(By.id("ename"));
		element.sendKeys("Suman");
		element = driver.findElement(By.id("esal"));
		element.sendKeys("15000");
		element = driver.findElement(By.id("edept"));
		element.sendKeys("IT");

		String id = driver.findElement(By.xpath("//*[@id=\"eid\"]")).getText();
		System.out.println(id);
		String name = driver.findElement(By.xpath("//*[@id=\"ename\"]")).getText();
		System.out.println(name);
		String sal = driver.findElement(By.xpath("//*[@id=\"esal\"]")).getText();
		System.out.println(sal);
		String dept = driver.findElement(By.xpath("//*[@id=\"edept\"]")).getText();
		System.out.println(dept);
	}
}

