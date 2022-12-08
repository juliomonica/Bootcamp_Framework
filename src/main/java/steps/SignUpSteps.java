package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SignUpPage;

public class SignUpSteps extends BaseSteps {

    SignUpPage signUpPage = PageFactory.initElements(webDriver, SignUpPage.class);

    public SignUpSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSignUpLink() {
        signUpPage.getLinkSignUp().click();
    }
}
