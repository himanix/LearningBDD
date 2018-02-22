package StepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ContinuePage;
import pageobjects.HomePage;
import pageobjects.UsernamePage;

public class StepDef {

    HomePage hp=new HomePage();
    ContinuePage cp=new ContinuePage();
    UsernamePage up=new UsernamePage();


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        hp.openhomepage();
        hp.clickonlogin();
        hp.movedriverhandle();
    }

    @When("^User navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        cp.clickoncontinue();
        cp.switchframe();
    }

    @And("^Enters \"(.*)\" and \"(.*)\"$")
    public void enters_username_and_password(String username,String password) throws Throwable {
          up.enterusername(username);
          up.clickonnext();
    }

    @Then("^User account page opens$")
    public void user_account_page_opens() throws Throwable {

    }

}
