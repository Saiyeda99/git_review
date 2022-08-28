package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPOM {
WebDriver driver;
public EbayPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
////*[@id="gh-p-2"]/a
@FindBy(xpath="//*[@id=\"gh-p-2\"]/a")
WebElement click_sell;

	public WebElement click_sell() {
		return click_sell;}

////a[@_sp="p3606739.m47969.i1.l50953"]
	@FindBy(xpath="//a[@_sp=\"p3606739.m47969.i1.l50953\"]")
	WebElement list_an_item;

		public WebElement list_an_item() {
			return list_an_item;}
}




