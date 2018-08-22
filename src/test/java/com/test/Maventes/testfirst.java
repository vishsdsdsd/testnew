package com.test.Maventes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testfirst {
	WebDriver driver;
  @Test
  public void f() 
  
  {
	  
	  callfun c= new callfun(driver);
		c.calf();
		
	SignInp si =new SignInp(driver);
	si.SignIn();
	
	
	Select se=new Select(driver);
	se.select();
	se.SelectDress();
	se.option();
	//se.ptc();
  }
  @BeforeTest
  public void beforeTest() {
	  

	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_product=5&controller=product");
		driver.manage().window().maximize();
		
  }

  @AfterTest
  public void afterTest() {
	  
	 // driver.quit();

	  
  }

}
