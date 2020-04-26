package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	
	
	public WebDriver driver;
	
	
	@Test
	public void openapp4()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Test 4");
	}
	
	
	@Test
	public void openapp5()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Test 5");
	}
	
	@Test
	public void openapp6()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Test 6");
	}
}
