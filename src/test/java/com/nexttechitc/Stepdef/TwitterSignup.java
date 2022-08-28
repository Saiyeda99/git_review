package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.TwitterSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterSignup {
private static WebElement Click_month;
WebDriver driver;
@Given("^user visits Twitter homepage$")
public void user_visits_Twitter_homepage() throws Throwable {
	try {
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
		 //implicit wait
				  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//how to open URL?
				  driver.get("https://twitter.com/i/flow/signup");
				  Thread.sleep(3000);	
		 //maximize window
				  driver.manage().window().maximize();	 
	}
		
	catch(Exception e) {
		System.out.println("browser and url is not working");} 
}

@When("^user click signup with phone number or email$")
public void user_click_signup_with_phone_number_or_email() throws Throwable {
	TwitterSignupPOM obj=new TwitterSignupPOM(driver) ; 
	obj.signupwithphoneoremail().click();
	
}

@When("^user type \"([^\"]*)\", \"([^\"]*)\" and select date of birth: month, date, year$")
public void user_type_and_select_date_of_birth_month_date_year(String arg1, String arg2) throws Throwable {
	try {
	TwitterSignupPOM obj1=new TwitterSignupPOM(driver) ;
	obj1.name().sendKeys(arg1);
	obj1.phonenumber().sendKeys(arg2);
	Thread.sleep(3000);
	
	Select se1=new Select(obj1.month());
	se1.selectByIndex(3);
	
	Select se2=new Select(obj1.day());
	se2.selectByValue("8");
	
	Select se3=new Select(obj1.year());
	se3.selectByVisibleText("1999");
	Thread.sleep(3000);
}
catch(Exception e) {
	System.out.println("select mathod not working");
}
	
	
}
@When("^user click next and click next and click sign up$")
public void user_click_next_and_click_next_and_click_sign_up() throws Throwable {
	try {
	TwitterSignupPOM obj2=new TwitterSignupPOM(driver) ;
	obj2.next().click();
	TwitterSignupPOM obj3=new TwitterSignupPOM(driver) ;
	obj3.next().click();
}
catch(Exception e) {
	System.out.println("click button not working");
}
	
	
}
@Then("^user will be able to signup Twitter$")
public void user_will_be_able_to_signup_Twitter() throws Throwable {
   driver.quit();
}


}
