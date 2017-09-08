package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class First {

	@Test
	public void fun()
	{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("w3schools");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).submit();
		driver.findElement(By.xpath("//a[contains(text(),'W3Schools HTML Tutorial')]")).click();
		
	}

}
