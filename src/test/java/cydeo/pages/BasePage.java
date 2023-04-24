package cydeo.pages;

import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static String userType;

    protected WebDriver driver;

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement inputUsername;

    @FindBy (id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement logInButton;

    @FindBy(xpath = "(//div[@class='loader-frame'])[last()]")
    protected WebElement loaderMask;


    public void driverLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("driver.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        logInButton.click();

    }

    public void salesManagerLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("salesmanager.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        logInButton.click();

    }    public void storeManagerLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("storemanager.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("all.pw"));
        logInButton.click();
    }

    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void navigateToModule(String menuName) { //Fleet
        By menuLocator = By.xpath("//span[text()[normalize-space() = '" + menuName + "']]");
        BrowserUtils.clickWithTryCatch(menuLocator);
    }

    public void navigateToModule(String menuName, String subMenuName) { //Fleet - Vehicles
        By menuLocator = By.xpath("//span[text()[normalize-space() = '" + menuName + "']]");
        BrowserUtils.clickWithTryCatch(menuLocator);

        By subMenuLocator = By.xpath("//span[text()[normalize-space() = '" + subMenuName + "']]");
        BrowserUtils.clickWithTryCatch(subMenuLocator);
    }

    public void navigateToModule(String menuName, String subMenuName, String subSubmenu) {
        By menuLocator1 = By.xpath("//span[text()[normalize-space() = '" + menuName + "']]");
        BrowserUtils.clickWithTryCatch(menuLocator1);

        By menuLocator2 = By.xpath("//span[text()[normalize-space() = '" + subMenuName + "']]");
        BrowserUtils.clickWithTryCatch(menuLocator2);

        By menuLocator3 = By.xpath("//span[text()[normalize-space() = '" + subSubmenu + "']]");
        BrowserUtils.clickWithTryCatch(menuLocator3);
    }

    public void goBack(){
        driver.navigate().back();
    }



}
