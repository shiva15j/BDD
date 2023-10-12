package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddcustomerPage {

	public WebDriver ldriver;

	public AddcustomerPage(WebDriver driver) {

		ldriver = driver;

		PageFactory.initElements(ldriver, this);
	}

	By lnkCutomersmenu = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");

	By lnkCutomers_menuitem = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a");

	By btnAddnew = By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");

	By txtEmail = By.name("Email");

	By txtpassword = By.name("Password");

	By txtfirstname = By.name("FirstName");

	By txtlastname = By.name("LastName");

	By txtradio = By.name("Gender");

	By txtdob = By.name("DateOfBirth");

	By txtsave = By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");
	
	
	
}
