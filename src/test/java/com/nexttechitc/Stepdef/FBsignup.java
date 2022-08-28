package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsignup {
WebDriver driver;
@Given("^user visiting facebook url$")
public void user_visiting_facebook_url() throws Throwable {
	try {
	//how to open browser?
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
	 //implicit wait
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//how to open URL?
			  driver.get("https://www.facebook.com/reg/");
			  Thread.sleep(3000);	
	 //maximize window
			  driver.manage().window().maximize();	 
}
	
catch(Exception e) {
	System.out.println("browser and url is not working");
}
}

@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	try {
	FbsignupPOM fbsignup=new FbsignupPOM(driver);
	fbsignup.firstname().sendKeys(arg1);
	fbsignup.lastname().sendKeys(arg2);
	fbsignup.email().sendKeys(arg3);
	fbsignup.password().sendKeys(arg4);
	//Explicit wait or WebDriver wait
		WebDriverWait wait =new WebDriverWait(driver,20);
}
	
catch(Exception e) {
	System.out.println("element not found exception");
	}
}

@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	try {
	FbsignupPOM fbsignup=new FbsignupPOM(driver);
	Select dropdown=new Select(fbsignup.click_month);
	dropdown.selectByIndex(2);
	Thread.sleep(3000);
	
	Select dropdown1=new Select(fbsignup.click_day);
	dropdown1.selectByValue("2");
	Thread.sleep(3000);
	
	Select dropdown2=new Select(fbsignup.click_year);
	dropdown2.selectByVisibleText("2004");
	Thread.sleep(3000);
	
	fbsignup.female().click();
	fbsignup.Signup().click();
	//Explicit wait or WebDriver wait
			WebDriverWait wait =new WebDriverWait(driver,20);
	}
	
catch(Exception e) {
	System.out.println("element not found");
}
	
}
}
