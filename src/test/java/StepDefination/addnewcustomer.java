package StepDefination;

import org.openqa.selenium.WebDriver;

import Pageobject.addnewcustomer1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addnewcustomer {

	WebDriver driver;

	addnewcustomer1 ad;

	@When("User click on customer Menu")
	public void user_click_on_customer_menu() {
		ad.clickoncustomermenu();

	}

	@When("click on customer Menu item")
	public void click_on_customer_menu_item() {
		ad.customermenu();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {

		ad.menuitemadd();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualurl = driver.getCurrentUrl();

		String expecturl = "https://admin-demo.nopcommerce.com/Admin/Customer/Create";

		if (actualurl.equals(expecturl)) {
			System.out.println("Correct page");
		} else {
			System.out.println("Incorrect");
		}

	}

	@When("user enter customer page")
	public void user_enter_customer_page() {

		ad.enterdetails("shivam34@mail.com", "12345", "shiavm", "srivastava");

	}

	@When("click on save button")
	public void click_on_save_button() {
		ad.clickonsavebtn();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
