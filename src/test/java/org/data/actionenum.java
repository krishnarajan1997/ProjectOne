package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionenum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kailash Maruthi\\eclipse-workspace\\Day 6\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		WebElement c = driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		
		//WebElement c = driver.findElement(By.xpath("(//a[@role='button'])[5]"));
		//c.click();
		Thread.sleep(3000);
//for (int i = 0; i < 7; i++) {
		a.keyDown(c,Keys.SHIFT).sendKeys("trichy").keyUp(c,Keys.SHIFT).perform();

		//a.keyDown(Keys.TAB).perform();
		//a.keyUp(Keys.TAB).perform();

		
	}

}
