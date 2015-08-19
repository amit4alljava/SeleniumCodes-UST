
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestBrowsers {

	long startTime ;
	long endTime;
	@BeforeMethod
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	@AfterMethod
	public void end(){
			endTime = System.currentTimeMillis();
			System.out.println("Total Time Taken "+(endTime-startTime));
	}
	
	//@Test(timeOut=12000)
	@Test
	public void testFireFox(){
		//System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		// Web Driver Code Starts 
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		String titleValue = driver.getTitle();
		// Web Driver Code Ends
		String expectedTitle = "Mercury";
		Assert.assertTrue(titleValue.contains(expectedTitle));
		driver.close();
	}
	
}
