package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.TwitterLoginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterLogin {
WebDriver driver;

@Given("^user visit Twitter homepage$")
public void user_visit_Twitter_homepage() throws Throwable {
	try {
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
		 //implicit wait
				  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//how to open URL?
				  driver.get("https://twitter.com/i/flow/login");
				  Thread.sleep(3000);	
		 //maximize window
				  driver.manage().window().maximize();	 
	}
		
	catch(Exception e) {
		System.out.println("browser and url is not working");} 
}


@When("^user type valid  \"([^\"]*)\" and click next$")
public void user_type_valid_and_click_next(String arg1) throws Throwable {
	TwitterLoginPOM obj=new TwitterLoginPOM(driver); 
	obj.email().sendKeys(arg1);
	Thread.sleep(3000);
	obj.next().click();
	Thread.sleep(3000);
}

@When("^user type valid \"([^\"]*)\" password and click signin$")
public void user_type_valid_password_and_click_signin(String arg1) throws Throwable {
	TwitterLoginPOM obj1=new TwitterLoginPOM(driver); 
	obj1.password().sendKeys(arg1);
	Thread.sleep(2000);
	obj1.signin().click();
	Thread.sleep(3000);
}

@Then("^user will be able to login successfully$")
public void user_will_be_able_to_login_successfully() throws Throwable {
   
}


}
