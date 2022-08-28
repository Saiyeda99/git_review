package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchPOM {
WebDriver driver;
public EbaySearchPOM  (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"gh-ac\"]")
WebElement Type_EbaySearch;
public WebElement EbaySearch() {
	return Type_EbaySearch;
}
	
	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	WebElement Click_Searchicon;
	public WebElement Searchicon() {
		return Click_Searchicon;
		
	}
	
		
}
