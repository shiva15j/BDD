package StepDefination;

import org.openqa.selenium.WebDriver;

import Pageobject.AddcustomerPage;
import Pageobject.addnewcustomer1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addnewcustomer {

	public WebDriver driver;

	AddcustomerPage ad= new AddcustomerPage(driver);

	@When("User click on customer Menu")
	public void user_click_on_customer_menu() {
		ad.ClickCutomerMenu();

	}

	@When("click on customer Menu item")
	public void click_on_customer_menu_item() {
		ad.ClickCustomerMenuItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {

		ad.Addnew();
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

		ad.setEmail("shivam@mail.com");

		ad.setDob("15/06/1999");

		ad.setFirstname("shivam");

		ad.setGender("male");
		ad.setLname("srivastava");

		ad.setPassword("1234");

	}

	@When("click on save button")
	public void click_on_save_button() {
		ad.clickonsave();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
