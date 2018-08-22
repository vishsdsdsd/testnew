package com.test.Maventes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */


public class App {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
	driver=new ChromeDriver();
		Setup s= new Setup(driver);
		s.setu();
		
		callfun c= new callfun(driver);
		c.calf();
	
		
		
	}
}