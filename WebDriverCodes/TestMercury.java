

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMercury {
	
	@Test
	public void testHomePage(){
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		String title = driver.getTitle();
		String expectedTitle = "Mercury";
		Assert.assertTrue(title.contains(expectedTitle));
		//Assert.assertEquals(title, expectedTitle);
		driver.close();
	}

}
