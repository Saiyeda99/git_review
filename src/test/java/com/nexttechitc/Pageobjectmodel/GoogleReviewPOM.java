package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleReviewPOM {
WebDriver driver;
public GoogleReviewPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
WebElement Type_Nexttechitc;
public WebElement Nexttechitc() {
	return Type_Nexttechitc;

}
@FindBy(xpath="//input[@value=\"Google Search\"]")
WebElement Click_googlesearch;
public WebElement googlesearch() {
	return Click_googlesearch;
}
@FindBy(xpath="//*[@id=\"gsr\"]")
WebElement Click_write_a_review;
public WebElement writeareview() {
	return Click_write_a_review;

}
}



