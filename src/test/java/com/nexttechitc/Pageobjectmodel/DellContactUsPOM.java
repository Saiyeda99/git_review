package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellContactUsPOM {
	WebDriver driver;//global variable
	

	public DellContactUsPOM(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
		   
		   
		   
		  // @FindBy(xpath="/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]")
		   
		  @FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a/span/span")
		   WebElement click_ContactUs;
		   public WebElement ContactUs(){
		  return click_ContactUs;
}
}