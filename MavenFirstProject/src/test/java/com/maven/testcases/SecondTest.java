package com.maven.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {

	
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "C:\\LatestChrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.quit();
	}
}
