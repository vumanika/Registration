package com.cg.RegistrationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registration1 {
	@FindBy(how=How.NAME,using="lastname")
	WebElement lastname;
	@FindBy(how=How.NAME,using="email")
	WebElement email;
	@FindBy(how=How.NAME,using="address")
	WebElement address;
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	@FindBy(how=How.NAME,using="state")
	WebElement state;
	private static WebElement element = null;
	 public static WebElement firstname(WebDriver driver){
		 
        element = driver.findElement(By.name("firstname"));

        return element;

        }
}
