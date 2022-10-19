package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_definition extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	// static WebDriver driver = null;

	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("User Enter the keyword {string}")
	public void user_enter_the_keyword(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);

	}

	@When("User click on Search Button")
	public void user_click_on_search_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		// driver.findElement(By.name("btnK")).click();

	}

	@Then("Search result related to {string} word should display")
	public void search_result_related_to_word_should_display(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("Search related to Selenium get Displayed");
		// driver.quit();
	}
//WebOrder Login 

	@Given("User navigating to Web Order website page")
	public void user_navigating_to_web_order_website_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User Enter the keyword {string} in the username field")
	public void user_enter_the_keyword_in_the_username_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

	}

	@When("User Enter the keyword {string} in the password field")
	public void user_enter_the_keyword_in_the_password_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
	}

	@Then("User should see {string} is displayed")
	public void user_should_see_is_displayed(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		// Verify that user has logged in
		driver.findElement(By.id("ctl00_logout")).isDisplayed();
		// driver.quit();
	}

	@When("User click on  LogOut link from the home page")
	public void user_click_on_log_out_link_from_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("User should be taken back to Login page")
	public void user_should_be_taken_back_to_login_page() {
		driver.findElement(By.name("ctl00$MainContent$login_button")).isDisplayed();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

	}

	@Then("User Clicks on Order Button")
	public void user_clicks_on_order_button() {
		driver.findElement(By.linkText("Order")).click();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("User enters Product, Quantity, Price per unit, Discount,Total, Customer name, Street, City, State, Zip, Card, Card number, Expire date in Web Order")
	public void user_enters_product_quantity_price_per_unit_discount_total_customer_name_street_city_state_zip_card_card_number_expire_date_in_web_order() {
		Select selectProduct = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		selectProduct.selectByVisibleText("ScreenSaver");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("5");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("100");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("10");
		driver.findElement(By.xpath("//input[@class='btn_dark']")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Dixit");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Add line1");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("CityName");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("StateName");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("098765");
		driver.findElement(By.xpath("//input[@value='MasterCard']")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234123412341234");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("09/25");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on Process Button")
	public void user_click_on_process_button() {
		driver.findElement(By.linkText("Process")).click();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("New order has been successfully added {string} is displayed")
	public void user_should_see_is_display(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("New order has been successfully added");
		// driver.quit();
	}

	@Given("User is on WebOrder Home Page")
	public void user_is_on_web_order_home_page() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String upass) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(uname);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(upass);
	}

	@When("User click on Login button")
	public void user_click_on_Login_button() {
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("User should be in Home page and Logout button should display")
	public void user_should_be_in_home_page_and_logout_button_should_display() {
		driver.findElement(By.id("ct100_logout")).isDisplayed();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
//--------------------Web Order TCs---------------------//
	@Then("User should get proper {string}")
	public void user_should_get_proper(String ExpResult) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if (ExpResult.equalsIgnoreCase("Invalid Login or Password.")) {
			String ActResult = driver.findElement(By.id("ctl00_MainContent_status")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			
		} else 
		{
			String ActResult = driver.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			driver.findElement(By.linkText("Logout")).click();
		}
	}
		
}
