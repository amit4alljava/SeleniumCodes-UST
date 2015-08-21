

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeDemo {

	@Test
	public void testOnLinux() throws Exception {
		String expectedValue="Flight";
		System.out.println("Node Code Start");
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.LINUX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.154.128:5555/wd/hub"),capability);
		driver.get("http://newtours.demoaut.com/");
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("amitsrivastava");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("amit123456");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		driver.close();
		
		capability=null;
		System.gc();
		Assert.assertTrue(title.contains(expectedValue));
		

	}

}
