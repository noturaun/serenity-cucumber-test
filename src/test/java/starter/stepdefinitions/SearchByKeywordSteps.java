package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class SearchByKeywordSteps {


    @Steps
    GoogleSearchStepDefinitions googleSearchStepDefinitions;

    @Given("Aun is on Google search page")
    public void aun_is_on_google_search_page() {
        googleSearchStepDefinitions.alreadyOpenedABrowser();
    }

    @When("he enters {string} as keyword")
    public void he_enters_as_keyword(String keyword) {
        googleSearchStepDefinitions.enterKeyword(keyword);
    }

    @Then("he should redirected to the result page for the {string} or {string}")
    public void he_should_redirected_to_the_result_page_for_the_or(String term1, String term2) {
        googleSearchStepDefinitions.shouldBeRedirectedToResultPage(term1, term2);
    }
}
