package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addnewcustomer1 {

	public WebDriver ldriver;

	public addnewcustomer1(WebDriver driver) {

		ldriver = driver;

		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	@CacheLookup
	WebElement custbtn;

	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")
	@CacheLookup
	WebElement addmenuitm;

	@FindBy(xpath = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	@CacheLookup
	WebElement addnewcust;

	@FindBy(name = "Email")
	@CacheLookup
	WebElement eml;

	@FindBy(name = "Password")
	@CacheLookup
	WebElement pswd;

	@FindBy(name = "FirstName")
	@CacheLookup
	WebElement fname;

	@FindBy(name = "LastName")
	@CacheLookup
	WebElement lname;

	@FindBy(xpath = "/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	@CacheLookup
	WebElement svbtn;
	
	
	public void clickoncustomermenu() {
		custbtn.click();
	}
	
	public void customermenu() {
		custbtn.click();
	}

	public void menuitemadd() {
		addmenuitm.click();
	}
	public void enterdetails(String email, String password, String firstname, String lastname) {

		eml.sendKeys(email);
		pswd.sendKeys(password);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);

	}

	public void clickonsavebtn() {
		svbtn.click();
	}

}
