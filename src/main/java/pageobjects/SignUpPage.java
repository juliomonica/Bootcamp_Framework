package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign up')]")
    private WebElement linkSignUp;

    public WebElement getLinkSignUp() {
        return linkSignUp;
    }
}
