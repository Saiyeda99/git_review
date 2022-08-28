package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DellAction1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction1 {
WebDriver driver;
@Given("^users visit Dell homepage$")
public void users_visit_Dell_homepage() throws Throwable {
	try {
		 //how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
		//implicit wait
				  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//how to open URL?
				  driver.get("https://www.dell.com/en-us");
				  Thread.sleep(5000);	
		 //maximize window
				  driver.manage().window().maximize();
			}
			
		catch(Exception e) {
			System.out.println("browser and url is not opening");
				} 
}

@When("^users go to solutions dropdown menu and able to see cloud solutions$")
public void users_go_to_solutions_dropdown_menu_and_able_to_see_cloud_solutions() throws Throwable {
	try {
		
   Actions act=new Actions(driver);
   DellAction1POM obj=new DellAction1POM(driver);
   act.moveToElement(obj.allsolution()).build().perform();
   Thread.sleep(4000);
   obj.Cloudsolution().click();
 //Explicit wait or WebDriver wait
 		WebDriverWait wait =new WebDriverWait(driver,20);
}
catch(Exception e) {
	System.out.println("dropdown not working");}
}


@When("^user click multi cloud data services$")
public void user_click_multi_cloud_data_services() throws Throwable {
	try {
	Actions act=new Actions(driver);
	DellAction1POM obj=new DellAction1POM(driver);
	act.moveToElement(obj.multiclouddataservices()).build().perform();
	   Thread.sleep(5000); 
	   obj.multiclouddataservices().click();
//Explicit wait or WebDriver wait
	 		WebDriverWait wait =new WebDriverWait(driver,20);
}
catch(Exception e) {
	System.out.println("multicloud");}
}


@Then("^user will redirect to expected page$")
public void user_will_redirect_to_expected_page() throws Throwable {
    driver.quit();
}


}
