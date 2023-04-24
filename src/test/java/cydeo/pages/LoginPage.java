package cydeo.pages;

import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BasePage {

	public LoginPage(){

		PageFactory.initElements(Driver.getDriver(),this);

	}

	//---locators----------------

	@FindBy(id = "prependedInput")
	public WebElement usernameField;

	@FindBy(id = "prependedInput2")
	public WebElement passwordField;

	@FindBy(id = "_submit")
	public WebElement loginBtn;

	@FindBy(className = "oro-subtitle")
	private WebElement pageSubtitle;

	//---methods-----------------

	public void goLoginPage() {
		driver.get(ConfigurationReader.getProperty("url"));
	}


	public void loginAsUserType(String userType){

		//userType variable is in BasePage
		//it'll be used in other Scenarios
		BasePage.userType = userType;

		String password = "";
		String username = "";

		switch (userType.toLowerCase()) {
			case "driver":
				username = ConfigurationReader.getProperty("driver.username");
				password = ConfigurationReader.getProperty("all.pw");
				break;
			case "sales manager":
				username = ConfigurationReader.getProperty("salesmanager.username");
				password = ConfigurationReader.getProperty("all.pw");
				break;
			case "store manager":
				username = ConfigurationReader.getProperty("storemanager.username");
				password = ConfigurationReader.getProperty("all.pw");
				break;
		}

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginBtn.click();
	}

	public String getSubtitle(){
		BrowserUtils.wait(1);
		return pageSubtitle.getText();
	}
}
