package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterSignup1POM {

WebDriver driver;
public TwitterSignup1POM(WebDriver driver) {
	this. driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/div/span/span")
WebElement click_Signup_with_phone_email;
public WebElement signupwithphoneoremail() { ;
return click_Signup_with_phone_email;
}

@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/label/div/div[2]/div/input")
WebElement Type_name;
public WebElement name() {
return Type_name;
  }
@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/span")
WebElement Click_use_email_instead;
public WebElement useemailinstead() {
return Click_use_email_instead;
}


@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/label/div/div[2]/div/input")
WebElement Type_email;
public WebElement email() {
return Type_email;
}

@FindBy(xpath="//*[@id=\"SELECTOR_1\"]")
WebElement Select_month;
public WebElement month() {
return Select_month;
  }
@FindBy(xpath="//*[@id=\"SELECTOR_2\"]")
WebElement Select_day;
public WebElement day() {
return Select_day;
  }

@FindBy(xpath="//*[@id=\"SELECTOR_3\"]")
WebElement Select_year;
public WebElement year() {
return Select_year;
}
@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/span/span")
WebElement click_next;
public WebElement next() {
return click_next;
}

@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div\r\n" + 
		"")
WebElement Click_Singup;
public WebElement signup() {
	return Click_Singup;


}
}