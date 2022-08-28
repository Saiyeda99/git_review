package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.DellContactUsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellContactUs {
WebDriver driver;

@Given("^user visits Dell ContactUs page$")
public void user_visits_Dell_ContactUs_page() throws Throwable {
	//how to open browser?
			
	//how to open URL?
			  driver.get("https://www.dell.com/");
			  Thread.sleep(4000);
}

@When("^user Click on ContactUs$")
public void user_Click_on_ContactUs() throws Throwable {
	DellContactUsPOM contactus=new DellContactUsPOM(driver) ;
	contactus.ContactUs().click();
}

@Then("^user should be able to redirect to ContactUs page$")
public void user_should_be_able_to_redirect_to_ContactUs_page() throws Throwable {
    
}


}
