package cydeo.pages;

import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends BasePage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Mustafa's codes start here

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    public WebElement fleetOnQLaunchpad;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[20]/div/div/a")
    public WebElement threeDotOnDriver;

    @FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div/div/div")
    public WebElement noPermissionMessage;


    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")
    public WebElement fleetTab;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[21]/div/div/a")
    public WebElement threeDotsInCarsPage;

    @FindBy(xpath = "/html/body/ul/li/ul/li[3]")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/h3")
    public WebElement deleteConfirmationPopup;

    @FindBy(xpath = "/html/body/div[6]/div[3]/a[2]")
    public WebElement yesDeleteButton;

    @FindBy(xpath = "//*[@id=\"flash-messages\"]//div[.='Item deleted']")
    public WebElement itemDeletedMessage;

    @FindBy(xpath = "//td[@data-column-label='License Plate']")
    public List<WebElement> licencePlateColumn;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public WebElement anyLicensePlate;

//Mustafa's codes end here

    //Fatma's codes starts from here


    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filter;

    @FindBy(id = "ui-multiselect-0-0-option-4")
    public WebElement SelectChassisNumber;

    @FindBy(className = "add-filter-button")
    public WebElement ManageFilters;
    @FindBy(xpath = "//div[contains(@class, 'oro-drop-opener')]")
    public WebElement ChassisNumberButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div/span/div[5]/div[2]/div/div[1]/button/span")
    public WebElement MethodDropDown;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement SelectedMethodCheck;
    @FindBy(xpath = "//a[@data-value='7']")
    public WebElement BetweenMethod;

    @FindBy(xpath = "//a[@data-value='8']")
    public WebElement NotBetweenMethod;

    @FindBy(xpath = "//a[@data-value='3']")
    public WebElement EqualsMethod;

    @FindBy(xpath = "//a[@data-value='4']")
    public WebElement NotEqualsMethod;

    @FindBy(xpath = "//a[@data-value='2']")
    public WebElement MoreThanMethod;

    @FindBy(xpath = "//a[@data-value='6']")
    public WebElement LessThanMethod;

    @FindBy(xpath = "//a[@data-value='1']")
    public WebElement EqualsOrMoreThanMethod;

    @FindBy(xpath = "//a[@data-value='5']")
    public WebElement EqualsOrLessThanMethod;

    @FindBy(xpath = "//a[@data-value='filter_empty_option']")
    public WebElement IsEmptyMethod;

    @FindBy(xpath = "//a[@data-value='filter_not_empty_option']")
    public WebElement IsNotEmptyMethod;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement Input1;

    @FindBy(xpath = "//input[@name='value_end']")
    public WebElement Input2;

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    public WebElement UpdateButton;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr/td[6]")
    public List<WebElement> SelectedChassisNumberBetweenList;



    public void enterMethodValues(String startVal, String endVal) {
        BrowserUtils.sendKeysWithWait(Input1, startVal, 1);
        BrowserUtils.sendKeysWithWait(Input2, endVal, 1);
        UpdateButton.click();
    }

    public void enterMethodValues(String val) {
        BrowserUtils.wait(1);
        BrowserUtils.sendKeysWithWait(Input1, val, 2);
        UpdateButton.click();
    }


    public List<WebElement>  verifyBetweenTableData() {
        By dataLocator = By.cssSelector("[data-column-label='Chassis Number']");
       List<WebElement> allData = driver.findElements(dataLocator);
        return allData;

    }



    public List<WebElement>  verifyFilteredTableData(String filterName){
        By dataLocator = By.cssSelector("tr[class='grid-row'] [data-column-label='"+filterName+"']");
        List<WebElement> allData;
        allData = driver.findElements(dataLocator);
        return allData;
    }



    @FindBy(css = "div.btn-group.btn-block.open li")
    private List<WebElement> allFilterMethods;

    public void selectFilterMethod(String methodName) {
        int size = allFilterMethods.size();

        for (WebElement allFilterMethod : allFilterMethods) {
            String actualMethodName = allFilterMethod.getText();
            if (actualMethodName.equalsIgnoreCase(methodName)) {
                BrowserUtils.clickWithWait((By) allFilterMethod, 2);
                break;
            }
        }
    }


}


    //Fatma's codes end here




















