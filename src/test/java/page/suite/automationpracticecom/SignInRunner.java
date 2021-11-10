package page.suite.automationpracticecom;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@SignIn",
        features = "src/test/resources/features/automationpracticedotcom/SignIn.feature",
        glue = {""})
public class SignInRunner {
}
