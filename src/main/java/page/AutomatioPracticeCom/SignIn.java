package page.AutomatioPracticeCom;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class SignIn extends PageObject {

    @FindBy(id = "email")
    WebElementFacade email;

    @FindBy(id = "passwd")
    WebElementFacade password;

    @FindBy(id = "SubmitLogin")
    WebElementFacade signInButton;

    @FindBy(className = "alert-danger")
    WebElementFacade auth_alert;

    @FindBy(css = ".alert-danger > p")
    WebElementFacade alertText;

    public SignIn(WebDriver driver) {
        super(driver);
    }

    public void enterCredential(String userEmail, String userPasswd){
        email.clear();
        email.sendKeys(userEmail);
        password.clear();
        password.sendKeys(userPasswd);
    }

    public void clickSignIn(){
        signInButton.click();
    }

    public Boolean getAuth_alert(){
        return auth_alert.isDisplayed();
    }

    public String getErrorText(){
        return alertText.getText();
    }

    public String getProfileTitle(){
        return getDriver().getTitle();
    }

}
