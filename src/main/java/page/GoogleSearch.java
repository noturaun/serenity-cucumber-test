package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://google.com")
public class GoogleSearch extends PageObject {

    @FindBy(name = "q")
    WebElementFacade input;

    @FindBy(xpath = "//div[@class='g']//a//h3")
    List<WebElementFacade> result;

    @FindBy(id = "rcnt")
    WebElementFacade resultContainer;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void enterKeyword(String keyword){
//        typeInto(input, keyword);
        input.sendKeys(keyword, Keys.RETURN);
        waitFor(3);
    }

    public List<String> resultList(){
        waitFor(5);
        List<String> resultsList = new ArrayList<>();
        result.forEach(item -> {
            if (item.containsText("Panda") || item.containsText("panda")){
                resultsList.add(item.getText());
            }
        });
        return resultsList;
    }

}
