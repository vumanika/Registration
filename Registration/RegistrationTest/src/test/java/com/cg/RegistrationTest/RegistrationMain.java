package com.cg.RegistrationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationMain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Users\\vumanika\\Desktop\\RegistationPage.html");
		Registration1 page = PageFactory.initElements(driver,Registration1.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		Registration1.firstname(driver).sendKeys("mani");
		Thread.sleep(1000);
		
		page.lastname.sendKeys("KANTA");
		Thread.sleep(1000);
		page.email.sendKeys("vum@ab.com");
		Thread.sleep(1000);
		page.address.sendKeys("adr1");
		Thread.sleep(1000);
		page.city.sendKeys("hyd");
		Thread.sleep(1000);
		page.state.sendKeys("Telangana");
		Thread.sleep(1000);
		page.state.submit();
		Thread.sleep(1000);
		 Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   driver.switchTo().alert().accept();
		   driver.navigate().to("D:\\Users\\vumanika\\Desktop\\project.html");
		   Project page1 = PageFactory.initElements(driver,Project.class);
		   Thread.sleep(1000);
			Project.projectname(driver).sendKeys("PRO_1");
			Thread.sleep(1000);
			page1.clientname.sendKeys("cli_1");
			Thread.sleep(1000);
			page1.teamsize.sendKeys("4");
			Thread.sleep(1000);
			page1.teamsize.submit();
			Thread.sleep(1000);
			 Alert alert1=driver.switchTo().alert();
			   System.out.println(alert1.getText());
			   driver.switchTo().alert().accept();
			  driver.close();
	}
}
