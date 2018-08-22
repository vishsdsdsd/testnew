package com.test.Maventes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class callfun {
WebDriver driver;

	public callfun(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}

	


	public void calf() {
		// TODO Auto-generated method stub
		
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();

		
		/*WebElement Qty = driver.findElement(By.id("quantity_wanted"));
		Qty.clear();
		Qty.sendKeys("3");

		WebElement size = driver.findElement(By.id("group_1"));
		size.sendKeys("M");

		WebElement col = driver.findElement(By.id("color_13"));
		col.click();

		WebElement add = driver.findElement(By.id("add_to_cart"));
		add.click();
		*/
	}
}
