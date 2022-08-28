package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAction1POM {
WebDriver driver;
public DellAction1POM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/button/span")
WebElement Click_allsolution;
public WebElement allsolution() {
	return Click_allsolution;
}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/button")
	WebElement Click_Cloudsolution;
	public WebElement Cloudsolution() {
		return Click_Cloudsolution;
   
	
}
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/ul/li[7]/a")
WebElement Click_multi_cloud_data_services;
public WebElement multiclouddataservices() {
	return Click_multi_cloud_data_services;

}
}