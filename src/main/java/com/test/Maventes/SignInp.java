package com.test.Maventes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInp {
	WebDriver driver;
	
	public SignInp(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver= driver2;
	}


	public void SignIn(){
	WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("vishal.shivhare98@gmail.com");

		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("vish2301");

		WebElement log = driver.findElement(By.id("SubmitLogin"));
		log.click();
	}

}
