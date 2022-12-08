package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "firstName")
    private WebElement textBoxFirstName;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement textBoxLastName;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement textBoxEmail;

    @FindBy(how = How.XPATH, using = "//input[@id='gender-radio-1']//following-sibling::label")
    private WebElement radioBtnMale;

    @FindBy(how = How.XPATH, using = "//input[@id='gender-radio-2']//following-sibling::label")
    private WebElement radioBtnFemale;

    @FindBy(how = How.XPATH, using = "//input[@id='gender-radio-3']//following-sibling::label")
    private WebElement radioBtnOther;

    public WebElement getTextBoxFirstName() {
        return textBoxFirstName;
    }

    public WebElement getTextBoxLastName() {
        return textBoxLastName;
    }

    public WebElement getTextBoxEmail() {
        return textBoxEmail;
    }

    public WebElement getRadioBtnMale() {
        return radioBtnMale;
    }

    public WebElement getRadioBtnFemale() {
        return radioBtnFemale;
    }

    public WebElement getRadioBtnOther() {
        return radioBtnOther;
    }
}
