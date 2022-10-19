package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Spreecom_step_definition extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	//static WebDriver driver = null;
	
	@Given("User navigating to Spree website page")
	public void user_navigating_to_spree_website_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.spreecommerce.org/login");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User select Login Button from drop down")
	public void user_select_login_button_from_drop_down() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='account-button']")).click();
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User Enter {string} in the email field")
	public void user_enter_in_the_email_field(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//*[@id='spree_user_email']")).sendKeys("Natalia@spree.com");
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("User Enter the {string} in the password field")
	public void user_enter_the_in_the_password_field(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@name='spree_user[password]']")).sendKeys("spree123");
		driver.findElement(By.xpath("//*[@name='commit']")).click();
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User Clicks on Add new address Button")
	public void user_clicks_on_add_new_address_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    Thread.sleep(3000);
	}

	@Then("User enters home name, first name, last name, address, city, state, zipcode, country, phone number,")
	public void user_enters_home_name_first_name_last_name_address_city_state_zipcode_country_phone_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[text()='Add new address']")).click();
		driver.findElement(By.xpath("//*[@id='address_firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//*[@id='address_lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//*[@id='address_address1']")).sendKeys("112 Ferry street");
		driver.findElement(By.xpath("//*[@id='address_city']")).sendKeys("brooklyn");
		driver.findElement(By.xpath("//*[@id='address_state_id']")).sendKeys("New York");
		driver.findElement(By.xpath("//*[@id='address_zipcode']")).sendKeys("10001");
		driver.findElement(By.xpath("//*[@id='address_phone']")).sendKeys("2123145555");
		
	}


	@Then("User Click on Save Button")
	public void user_click_on_save_button() {
		driver.findElement(By.linkText("Save")).click();
		

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	

	@Then("New address has been successfully created {string} is displayed")
	public void user_should_see_is_display(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("New address has been successfully created")).isDisplayed();
		// driver.quit();
	}


}
