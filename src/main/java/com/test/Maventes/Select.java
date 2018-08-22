package com.test.Maventes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select {
	
	WebDriver driver;
	
	public Select(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}

	public void select(){
	WebElement sel = driver.findElement(By.xpath("( //a[@title='Dresses' and @class='sf-with-ul'])[2]")); //Question???********* (//a[@title='Dresses' and @class='sf-with-ul'])[2]
		sel.click();
	}
	
	public void SelectDress()
	{
		WebElement sign = driver.findElement(By.xpath("//a[@class='product-name' and @title='Printed Dress']"));
		sign.click();
	}
	
	public void option()
	{
		WebElement Qty = driver.findElement(By.id("quantity_wanted"));
		Qty.clear();
		Qty.sendKeys("3");

		WebElement size = driver.findElement(By.id("group_1"));
		size.sendKeys("M");

		
		WebElement add = driver.findElement(By.id("add_to_cart"));
		add.click();
	}
	
	public void ptc() {
			WebElement pt=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			pt.click();
	}

}
