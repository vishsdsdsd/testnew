package com.test.Maventes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  //System.out.println("TEST");
	 
  }
  
  WebDriver driver;
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	//  System.out.println("BEFORE_TEST");
	  DesiredCapabilities Cp= new DesiredCapabilities();
	  Cp.setBrowserName("chrome");
	  driver = new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"), Cp);
			  
			 driver.get("http://mindyourstudents.blogspot.com/2017/10/selenium-grid.html");
	  
			 
  }

  @AfterTest
  public void afterTest() {
	//  System.out.println("AFTER_TEST");
  }

}
