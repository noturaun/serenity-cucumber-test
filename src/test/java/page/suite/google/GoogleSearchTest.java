package page.suite.google;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Search",
        features = "src/test/resources/features/GoogleSearch.feature",
        glue = {""})
public class GoogleSearchTest {
}
