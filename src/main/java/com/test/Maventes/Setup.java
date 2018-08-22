package com.test.Maventes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
	WebDriver driver;
	
	
	public Setup(WebDriver driver2) {
		driver= driver2;
	}
	public void setu(){
	
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		//driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_product=5&controller=product");
		driver.manage().window().maximize();
}
}