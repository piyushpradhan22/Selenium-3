package com.cucumber.framework.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver=null;
	
	@Given("^User navigated to newtours$")
	public void user_navigated_to_newtours() throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(8000);
		driver.quit();
	}

	@When("^user enter Username as (.*) and Password (.*)$")
	public void user_enter_Username_as_automation_gmail_com_and_Password_password(
			String username, String passowrd) throws Throwable {

	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {

	}

	@Then("^login should be (?:successful|unsuccessful)$")
	public void login_should_be_successful() throws Throwable {

	}

}
