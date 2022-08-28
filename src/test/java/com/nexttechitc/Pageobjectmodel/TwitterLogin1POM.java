package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterLogin1POM {
WebDriver driver;
public  TwitterLogin1POM(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")
WebElement Type_email;
public WebElement email() {
	return Type_email;
}


@FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div/span/span")
WebElement click_next;
public WebElement next() {
	return click_next;
}

@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input")
WebElement Type_password;
public WebElement password() {
	return Type_password;
}
@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div")
WebElement Click_Login;
public WebElement Login() {
	return Click_Login;
}
	
}



