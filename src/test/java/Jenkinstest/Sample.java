package Jenkinstest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void Test_1()
	{
		WebDriver driver,driver2;
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.youtube.com");
		
		System.out.println("Both the tests are executed fine..!");
		
	}

}
