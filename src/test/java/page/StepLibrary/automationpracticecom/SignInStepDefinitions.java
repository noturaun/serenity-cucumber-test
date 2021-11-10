package page.StepLibrary.automationpracticecom;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import page.AutomatioPracticeCom.SignIn;

import static org.assertj.core.api.Assertions.*;

public class SignInStepDefinitions {

    SignIn page;

    @Step("#user is on automationpractice sign in page")
    public void user_is_on_automatetionpractice_sign_in_page(){
        page.open();
    }

    @Step("#user enters his?her credential")
    public void enters_his_or_her_password(String email, String passwd){
        page.enterCredential(email, passwd);
        page.clickSignIn();
    }

    @Step("#user cannot signed in")
    public void cannot_signed_int(String expectedError){
        assertThat(page.getAuth_alert());
        assertThat(page.getErrorText()).isEqualTo(expectedError);
    }

    @Step("#user cannot signed in")
    public void can_signed_in(String expectedTitle){
        assertThat(page.getProfileTitle()).isEqualTo(expectedTitle);
    }
}
