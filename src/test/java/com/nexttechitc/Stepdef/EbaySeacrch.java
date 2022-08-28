package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.EbaySearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbaySeacrch {
WebDriver driver;
@Given("^user visit ebay home page$")
public void user_visit_ebay_home_page() throws Throwable {
	try {
	//how to open browser?
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
	 //implicit wait
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//how to open URL?
			  driver.get("https://www.ebay.com/");
			  Thread.sleep(3000);	
			  //maximize window
		
			 driver.manage().window().maximize();	
			 Thread.sleep(3000);
}
	
catch(Exception e) {
	System.out.println(" browser and URL not working");
	}
}


@When("^user type \"([^\"]*)\" and click searchicon$")
public void user_type_and_click_searchicon(String arg1) throws Throwable {
	try {
	EbaySearchPOM obj=new EbaySearchPOM(driver);
	obj.EbaySearch().sendKeys(arg1);
	Thread.sleep(3000);
obj.Searchicon().click();
//explicit wait
WebDriverWait wait=new WebDriverWait(driver,20);
	}
	catch(Exception e) {
		System.out.println("type and click not working");
	}
}



@Then("^user should be able to see expected product$")
public void user_should_be_able_to_see_expected_product() throws Throwable {
    driver.quit();
}


}
