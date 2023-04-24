package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.DashboardPage;
import cydeo.pages.LoginPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class Fatma_Chasis_Number_Filter_Step_Definitions {
    LoginPage loginPage = new LoginPage();
  DashboardPage dashboard = new DashboardPage();
  WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    private String filterName;
    private String Between;


    @Given("user is on login page")
    public void userIsOnLoginPage() {
      String url = ConfigurationReader.getProperty("login.page.url");
      Driver.getDriver().get(url);

            }
     @Given("User logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
       String userType="store manager";
       loginPage.loginAsUserType(userType);
       loginPage.waitUntilLoaderScreenDisappear();

     }
    @When("the user lands on Dashboard")
    public void the_user_lands_on_quick_launchpad() {
     String expectedTitle="Dashboard";
      String actualTitle = loginPage.getSubtitle();
      Assert.assertEquals(expectedTitle, actualTitle);
  }
    @When("the user clicks on Fleet tab")
  public void the_user_clicks_on_fleet_tab() throws InterruptedException {
        dashboard.fleetTab.click();

        Thread.sleep(2000);
    }
  @When("the user clicks on Vehicles option under fleet tab")
   public void the_user_clicks_on_vehicles_option_under_fleet_tab() {
      dashboard.vehiclesOption.click();
  }

    @When("the user clicks on filters icon")
    public void the_user_clicks_on_filters_icon() throws InterruptedException {
        Thread.sleep(2000);
dashboard.filter.click();
    }
   @When("the user clicks on manage filters and selects Chassis number")
   public void the_user_clicks_on_manage_filters_and_selects_chassis_number() {
        dashboard.ManageFilters.click();
        dashboard.SelectChassisNumber.click();


   }

    @Then("the user should see Chassis number button")
    public void theUserShouldSeeChassisNumberButton() {
        String expectedbuttonname= "Chassis Number: All";
        String actualbuttonname=dashboard.ChassisNumberButton.getText();
        Assert.assertEquals(expectedbuttonname, actualbuttonname);
    }



  @Then("the user clicks on Chassis number button to see various methods")
   public void the_user_clicks_on_chasis_number_button_to_see_various_methods() {
      dashboard.ChassisNumberButton.click();
    }

    @Then("the user validate Between method is displayed")
    public void the_user_validate_between_method_is_displayed() throws InterruptedException {
        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
dashboard.BetweenMethod.click();
        String expectedbuttonname1= "Between";
        String actualbuttonname1=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname1,actualbuttonname1);
    }

 @Then("the user validate Not Between method is displayed")
   public void the_user_validate_not_between_method_is_displayed() throws InterruptedException {
     dashboard.MethodDropDown.click();
     Thread.sleep(2000);
     dashboard.NotBetweenMethod.click();
     String expectedbuttonname1= "Not Between";
     String actualbuttonname1=dashboard.SelectedMethodCheck.getText();
     Assert.assertEquals(expectedbuttonname1,actualbuttonname1);
   }

   @Then("the user validate Equals method is displayed")
    public void the_user_validate_equals_method_is_displayed() throws InterruptedException {
       dashboard.MethodDropDown.click();
       Thread.sleep(2000);
       dashboard.EqualsMethod.click();
       String expectedbuttonname1= "Equals";
       String actualbuttonname1=dashboard.SelectedMethodCheck.getText();
       Assert.assertEquals(expectedbuttonname1,actualbuttonname1);

   }

   @Then("the user validate Not Equals with method is displayed")
   public void the_user_validate_not_equals_with_method_is_displayed() throws InterruptedException {
       dashboard.MethodDropDown.click();
       Thread.sleep(2000);
       dashboard.NotEqualsMethod.click();
       String expectedbuttonname2= "Not Equals";
       String actualbuttonname2=dashboard.SelectedMethodCheck.getText();
       Assert.assertEquals(expectedbuttonname2,actualbuttonname2);
  }

    @Then("the user validate More Than method is displayed")
    public void the_user_validate_more_than_method_is_displayed() throws InterruptedException {

        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.MoreThanMethod.click();
        String expectedbuttonname3= "More Than";
        String actualbuttonname3=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname3,actualbuttonname3);
    }

    @Then("the user validate Less Than method is displayed")
    public void the_user_validate_less_than_method_is_displayed() throws InterruptedException {
        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.LessThanMethod.click();
        String expectedbuttonname4= "Less Than";
        String actualbuttonname4=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname4,actualbuttonname4);
    }

    @Then("the user validate Equals or More Than method is displayed")
    public void the_user_validate_equals_or_more_than_method_is_displayed() throws InterruptedException {

        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.EqualsOrMoreThanMethod.click();
        String expectedbuttonname5= "Equals Or More Than";
        String actualbuttonname5=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname5,actualbuttonname5);
    }

    @Then("the user validate Equals or Less Than method is displayed")
    public void the_user_validate_equals_or_less_than_method_is_displayed() throws InterruptedException {

        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.EqualsOrLessThanMethod.click();
        String expectedbuttonname6= "Equals Or Less Than";
        String actualbuttonname6=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname6,actualbuttonname6);
    }

    @Then("the user validate Is Empty method is displayed")
    public void the_user_validate_is_empty_method_is_displayed() throws InterruptedException {
        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.IsEmptyMethod.click();
        String expectedbuttonname7= "Is Empty";
        String actualbuttonname7=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname7,actualbuttonname7);
    }

    @Then("the user validate Is Not Empty method is displayed")
    public void the_user_validate_is_not_empty_method_is_displayed() throws InterruptedException {
        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.IsNotEmptyMethod.click();
        String expectedbuttonname8= "Is Not Empty";
        String actualbuttonname8=dashboard.SelectedMethodCheck.getText();
        Assert.assertEquals(expectedbuttonname8,actualbuttonname8);

    }

    @Then("the user select Between method")
    public void theUserSelectBetweenMethod() throws InterruptedException {
        dashboard.MethodDropDown.click();
        Thread.sleep(2000);
        dashboard.BetweenMethod.click();
        Thread.sleep(2000);
    }


    @Then("the user select {string} method")
    public void theUserSelectMethod(String methodName) {
       dashboard.selectFilterMethod(methodName);
    }

    @And("The user enters {string} and {string} and clicks update button")
    public void theUserEntersAndAndClicksUpdateButton(String value1, String value2) {
        dashboard.enterMethodValues(value1,value2);

            }




    @Then("the user verifies the results based on the values entered {string} and {string}")
    public void theUserVerifiesTheResultsBasedOnTheValuesEnteredAnd(String value1, String value2) throws InterruptedException {

     BrowserUtils.wait(1);
      List<WebElement> allData = dashboard.verifyFilteredTableData(this.filterName);
        for (WebElement dataWE : allData) {
            BrowserUtils.wait(1);
          double data = Double.parseDouble(dataWE.getText().replace(",", ""));
           Assert.assertTrue(data >= Double.parseDouble(value1) && data <= Double.parseDouble(value2));
        }


    }




    @Then("the user enters {string} in the search box and clicks update button")
    public void theUserEntersInTheSearchBoxAndClicksUpdateButton(String value) {
        dashboard.enterMethodValues(value);
    }

    @Then("the user verifies the results based on the values entered {string}")
    public void theUserVerifiesTheResultsBasedOnTheValuesEntered(String val) {

    //  BrowserUtils.wait(1);
      //  List<WebElement> allData = dashboard.verifyFilteredTableData(this.filterName);
      //  for (WebElement dataWE : allData) {
      //  BrowserUtils.wait(1);
       //  double data = Double.parseDouble(dataWE.getText().replace(",",""));
       //  Assert.assertEquals(data, Double.parseDouble(val), 0.0);
       }






    }



