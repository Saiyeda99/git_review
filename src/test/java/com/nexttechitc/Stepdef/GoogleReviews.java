package com.nexttechitc.Stepdef;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.GoogleReviewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleReviews {
WebDriver driver;
@Given("^user go to google home page$")
public void user_go_to_google_home_page() throws Throwable {
	try {
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
		 //implicit wait
				  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//how to open URL?
				  driver.get("https://www.google.com/");
				  Thread.sleep(3000);	
		 //maximize window
				  driver.manage().window().maximize();	 
	}
		
	catch(Exception e) {
		System.out.println("browser and url is not working");} 
} 


@When("^user type \"([^\"]*)\" in the google search field$")
public void user_type_in_the_google_search_field(String arg1) throws Throwable {
	GoogleReviewPOM obj=new GoogleReviewPOM(driver); 
	obj.Nexttechitc().sendKeys(arg1);

}

@When("^user click search option$")
public void user_click_search_option() throws Throwable {
	GoogleReviewPOM obj1=new GoogleReviewPOM(driver);
	obj1.googlesearch().click();
	Thread.sleep(3000);
}

@When("^user scroll down and$")
public void user_scroll_down_and() throws Throwable {
	GoogleReviewPOM obj2=new GoogleReviewPOM(driver);
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
}

@When("^user click write a review to write a review$")
public void user_click_write_a_review_to_write_a_review() throws Throwable {
	GoogleReviewPOM obj3=new GoogleReviewPOM(driver);
	obj3.writeareview().click();
}

@When("^user type \"([^\"]*)\"$")
public void user_type(String arg1) throws Throwable {
   
}

@When("^user click start icon and click post$")
public void user_click_start_icon_and_click_post() throws Throwable {
    
}

@Then("^user able to post a review$")
public void user_able_to_post_a_review() throws Throwable {
    
}


}
