package starter.stepdefinitions;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import starter.GoogleSearch;

import static org.assertj.core.api.Assertions.*;

public class GoogleSearchStepDefinitions {

    @Managed(driver = "chrome", options = "--headless")
    WebDriver browser;

    String actor;
    String keyword;

    GoogleSearch page;

    @Step("#actor already opened a browser")
    public void alreadyOpenedABrowser(){
        page.open();
    }

    @Step("#actor enters #keyword to input field")
    public void enterKeyword(String keyword){
        page.enterKeyword(keyword);
    }

    @Step("#actor should be redirected to result page for #keyword")
    public void shouldBeRedirectedToResultPage(String term1, String term2){
        page.resultList().forEach(item -> assertThat(item).containsAnyOf(term1, term2));
    }
}
