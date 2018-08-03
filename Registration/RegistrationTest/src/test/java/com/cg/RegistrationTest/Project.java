package com.cg.RegistrationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Project {

	@FindBy(how=How.NAME,using="clientname")
	WebElement clientname;
	@FindBy(how=How.NAME,using="teamsize")
	WebElement teamsize;
	
	private static WebElement element = null;
	 public static WebElement projectname(WebDriver driver){
		 
        element = driver.findElement(By.name("projectname"));

        return element;

        }
}
