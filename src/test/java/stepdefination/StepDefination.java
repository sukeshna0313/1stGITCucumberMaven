package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    
	}

	@When("User open URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"")
	public void user_open_url_https_admin_demo_nopcommerce_com_login() {
	    
	}

	@When("User Enter Email as {string} and password as\"admin\"")
	public void user_enter_email_as_and_password_as_admin(String string) {
	    
	}

	@When("Click on Login")
	public void click_on_login() {
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	   
	}

	@Then("close browser")
	public void close_browser() {
	    
	}

}
