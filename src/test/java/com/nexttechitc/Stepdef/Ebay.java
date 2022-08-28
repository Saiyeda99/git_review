package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.EbayPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ebay {
	WebDriver driver;
	
	@Given("^User visits ebay home page$")
	public void user_visits_ebay_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		//implicit wait, soft wait/ we always use soft wait
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://www.ebay.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
	}

	@When("^user click sell option$")
	public void user_click_sell_option() throws Throwable {
		EbayPOM obj=new EbayPOM(driver);
		obj.click_sell().click();
	//Explicit wait or WebDriver wait
				WebDriverWait wait =new WebDriverWait(driver,20);
	}

	@When("^user click list an item$")
	public void user_click_list_an_item() throws Throwable {
		EbayPOM ob=new EbayPOM(driver);
		ob.list_an_item().click();
		Thread.sleep(3000);
	//Explicit wait or WebDriver wait
				WebDriverWait wait =new WebDriverWait(driver,20);
	}

	@When("^user click question mark$")
	public void user_click_question_mark() throws Throwable {
	    
	}

	@Then("^user will be able to see another page$")
	public void user_will_be_able_to_see_another_page() throws Throwable {
	    
	}

}
	