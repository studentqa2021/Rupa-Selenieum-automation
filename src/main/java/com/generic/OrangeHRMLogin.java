package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin extends Constant {
	
	public void login() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window(). maximize();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();}
		
		driver.findElement(By.xpath("//*[@name='username']")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(USER);
		
		driver.findElement(By.xpath("//*[@name='password']")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(PASSWORD);
	
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//driver.quit();
	}
		}
	

