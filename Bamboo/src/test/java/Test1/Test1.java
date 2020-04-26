package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 

{
	
	public WebDriver driver;
	
	@Test
	public void openapp1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Test 1");
	}
	
	@Test
	public void openapp2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Test 2");
	}
	
	@Test
	public void openapp3()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Test 3");
	}
	
	
	

}
