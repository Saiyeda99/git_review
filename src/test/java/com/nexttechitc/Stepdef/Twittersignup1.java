package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.TwitterSignup1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Twittersignup1 {
WebDriver driver;
@Given("^users visit Twitter homepage$")
public void users_visit_Twitter_homepage() throws Throwable {
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

@When("^user clicks signup with phone number or email$")
public void user_clicks_signup_with_phone_number_or_email() throws Throwable {
	TwitterSignup1POM obj=new TwitterSignup1POM(driver);
	obj.signupwithphoneoremail().click();
}

@When("^user types \"([^\"]*)\", and click use email instead$")
public void user_types_and_click_use_email_instead(String arg1) throws Throwable {
	try {
	TwitterSignup1POM obj1=new TwitterSignup1POM(driver);
	obj1.name().sendKeys(arg1);
	obj1.useemailinstead().click();
	}
	catch(Exception e){
		System.out.println("not typing");
	}
}


@When("^user type \"([^\"]*)\" and select date of birth: month, date, year$")
public void user_type_and_select_date_of_birth_month_date_year(String arg1) throws Throwable {
	try {
	TwitterSignup1POM obj2=new TwitterSignup1POM(driver);
	obj2.email().sendKeys(arg1);
	Thread.sleep(3000);
	
	Select se=new Select(obj2.month());
	se.selectByIndex(3);
	Thread.sleep(3000);
	
	Select se1=new Select(obj2.day());
	se1.selectByValue("8");
	Thread.sleep(3000);
	
	Select se2=new Select(obj2.year());
	se2.selectByVisibleText("1999");
	}
	catch(Exception e) {
		System.out.println("selest not working");
	}
}

@When("^user clicks next and click next and click sign up$")
public void user_clicks_next_and_click_next_and_click_sign_up() throws Throwable {
	TwitterSignup1POM obj3= new TwitterSignup1POM(driver);
	obj3.next().click();
	obj3.next().click();
	
	obj3.signup().click();
}

@Then("^user will be able to signup Twitter successfully$")
public void user_will_be_able_to_signup_Twitter_successfully() throws Throwable {
    driver.quit();
}


}