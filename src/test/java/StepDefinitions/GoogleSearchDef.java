package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.GoogleHomePage;

public class GoogleSearchDef {

    String expectedTitle;
    GoogleHomePage homePage=new GoogleHomePage();

    @When("^user gets the url$")
    public void user_gets_the_url(){
        homePage.getUrl();
    }

    @Given("^user enters \"([^\"]*)\" in search box$")
    public void user_enters_the_keyword_in_search_box(String keyword){
       homePage.enterkeyword(keyword);
    }

    @When("^user clicks on search button$")
    public void user_clicks_on_search_button(){
        homePage.clickonSearch();
    }

    @Then("^links are displayed according to \"([^\"]*)\"$")
    public void links_are_displayed_according_to_search(String keyword){
        String actualTitle= homePage.verifyTitle();
        Assert.assertEquals(keyword + " - Google Search",actualTitle);
    }


    @When("^user fetches the title of the page$")
    public void user_fetches_the_title_of_the_page(){
        expectedTitle=homePage.verifyTitle();
    }

    @Then("^user verifies the \"([^\"]*)\"$")
    public void user_verifies_the_title(String title){
       Assert.assertEquals(title,expectedTitle);
    }
}
