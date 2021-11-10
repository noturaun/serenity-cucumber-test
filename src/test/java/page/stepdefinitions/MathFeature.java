package page.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page.StepLibrary.AdditionStepDefinitions;

public class MathFeature {

    @Steps
    AdditionStepDefinitions additionStepDefinitions;

    @Given("{string} starts with {int}")
    public void starts_with(String actor, int amount) {
        additionStepDefinitions.startsWith(amount);
    }
    @When("s?he adds {int}")
    public void s_he_adds(int amount) {
        additionStepDefinitions.adds(amount);
    }
    @Then("s?he should have {int}")
    public void s_he_should_have(int total) {
        additionStepDefinitions.shouldHave(total);
    }

}
