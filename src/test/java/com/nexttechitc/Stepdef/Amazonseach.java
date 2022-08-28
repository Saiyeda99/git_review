 package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.AmzonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonseach {
	WebDriver driver;
	
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
	try {
//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
//implicit wait, soft wait/ we always use soft wait
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//how to open URL?
		  driver.get("https://www.amazon.com/");
		  Thread.sleep(3000);	
 //maximize window
		  driver.manage().window().maximize();
	}
		
catch(Exception e) {
	System.out.println("browser and url is not opening");
}
		
}
	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
		try {
		AmzonSearchPOM obj=new AmzonSearchPOM(driver);
		obj.Amazonsearch().sendKeys(arg1);
		Thread.sleep(2000);
		obj.searchicon().click();
	//Explicit wait or WebDriver wait
		WebDriverWait wait =new WebDriverWait(driver,20);
	}
	catch(Exception e) {
		System.out.println("amazon search option");}
	}
	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
	  driver.quit(); 
	}


}
