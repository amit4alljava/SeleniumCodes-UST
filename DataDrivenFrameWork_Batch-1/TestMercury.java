

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestMercury {
	
	@DataProvider(name="exceldata")
	public Object[][] fetchExcelData(){
		Object array[][]=null;
		try {
			// array=ReadWriteExcel.readExcel(); // Talk to Excel
			array = JDBC.readTableData(); // Talk to DB
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
	
	WebDriver driver ; // Declare
	//@BeforeMethod
	public void openDriver(){
		// Connect to the Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();  // Initalize it
		//WebDriver driver = new FirefoxDriver();
		
	}
	//@AfterMethod
	public void closeDriver(){
		driver.close();
	}
	
	// Test Case- 1
	@Test(enabled=false)
	public void testHomePage(){
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		String title = driver.getTitle();
		String expectedTitle = "Mercury";
		Assert.assertTrue(title.contains(expectedTitle));
		//Assert.assertEquals(title, expectedTitle);
		driver.close();
	}
	
	// Test Case - 2
	@Test(dataProvider="exceldata")
	public void testLogin(String userid, String pawd) throws Exception{
		if(userid!=null && pawd!=null){
		openDriver();
			driver.get("http://newtours.demoaut.com/");
		WebElement username = driver.findElement(By.name("userName"));
		//username.sendKeys("amitsrivastava");
		username.sendKeys(userid);
		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.name("password"));
		//pwd.sendKeys("amit123456");
		pwd.sendKeys(pawd);
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		closeDriver();
		}
		/*List<WebElement> radioList = driver.findElements(By.name("tripType"));
		radioList.get(1).click();
		WebElement selectBox = driver.findElement(By.name("fromPort"));
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		WebElement message = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font/text()"));
		String messageValue = message.getText();
		Assert.assertTrue(messageValue.contains("Select your departure"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(selectBox));
		Select selectFromPort = new Select(selectBox);
		selectFromPort.selectByVisibleText("Paris");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		Assert.assertTrue(linksList.size()>10);
		//selectFromPort.selectByValue("");
		//selectFromPort.selectByIndex(0);
		Thread.sleep(3000);
*/		
	}

}
