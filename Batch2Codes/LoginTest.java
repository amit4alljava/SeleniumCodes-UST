import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class LoginTest {
	
	@Test
	public void testLogin() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.sendKeys("amitsrivastava");
		Thread.sleep(1000);
		
		/*WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("amit123456");*/
		
		driver.findElement(By.name("password")).sendKeys("amit123456");
		
		
		
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		Thread.sleep(1000);
		
		
		List<WebElement> radioList = driver.findElements(By.name("tripType"));
		radioList.get(1).click();
		
		Thread.sleep(2000);
		
		WebElement select = driver.findElement(By.name("fromPort"));
		Select selectFromPort = new Select(select);
		selectFromPort.selectByVisibleText("Paris");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
