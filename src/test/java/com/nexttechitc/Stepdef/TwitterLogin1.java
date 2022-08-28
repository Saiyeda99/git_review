package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.TwitterLogin1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterLogin1 {
private static final TimeUnit Second = null;
WebDriver driver;
@Given("^user visit twitter home page$")
public void user_visit_twitter_home_page() throws Throwable {
	try {
	//how to open browser?
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  //implicit wait
	 
	  //open URL
	  driver.get("https://twitter.com/i/flow/login");
	  //maximize 
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
}
catch(Exception e) {
	System.out.println("browser and URL not opening");}
	
}
@When("^user type valid \"([^\"]*)\" and click next$")
public void user_type_valid_and_click_next(String arg1) throws Throwable {
	TwitterLogin1POM obj =new TwitterLogin1POM(driver);
obj.email().sendKeys(arg1);
Thread.sleep(3000);

obj.next().click();
Thread.sleep(3000);
}

@When("^user type valid \"([^\"]*)\" and click login$")
public void user_type_valid_and_click_login(String arg1) throws Throwable {
	TwitterLogin1POM obj1 =new TwitterLogin1POM(driver); 
	obj1.password().sendKeys(arg1);
	obj1.Login().click();
	Thread.sleep(3000);
}

@Then("^user able to login twitter account$")
public void user_able_to_login_twitter_account() throws Throwable {
    
}


}
