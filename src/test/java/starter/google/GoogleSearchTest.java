package starter.google;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = {""})
public class GoogleSearchTest {

//    @Steps
//    GoogleSearchSteps aun;
//
//    @Managed(driver = "chrome", options = "--headless")
//    WebDriver herBrowser;
//
//    @Test
//    public void tryToSearch() {
//        // Given
//        aun.alreadyOpenedABrowser();
//
//        // When
//        aun.enterKeyword("Panda");
//
//        //Then
//        aun.shouldBeRedirectedToResultPage("Panda", "panda");
//    }

}
