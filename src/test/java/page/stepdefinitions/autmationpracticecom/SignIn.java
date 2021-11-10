package page.stepdefinitions.autmationpracticecom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import page.StepLibrary.automationpracticecom.SignInStepDefinitions;


@WithTag("SignIn")
public class SignIn {

    @Steps
    SignInStepDefinitions actor;

    @Given("User is on automationpractice sign in page")
    public void user_on_automationpractice_sign_in_page() {
       actor.user_is_on_automatetionpractice_sign_in_page();
    }
    @When("{string} enters his?her {string} and {string}")
    public void enters_his_her_credential(String user,String email, String password) {
        actor.enters_his_or_her_password(email, password);
    }
    @Then("s?he cannot signed in")
    public void s_he_cannot_signed_in() {
//        String error = "Authentication failed.";
        String errorMessage = "There is 1 error";
        actor.cannot_signed_int(errorMessage);
    }

    @Then("s?he can signed in")
    public void s_he_can_signed_in() {
        actor.can_signed_in("My account - My Store");
    }
}
