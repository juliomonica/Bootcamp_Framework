package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.PracticeFormPage;

public class PracticeFormSteps extends BaseSteps {

    PracticeFormPage practiceFormPage = PageFactory.initElements(webDriver, PracticeFormPage.class);

    public PracticeFormSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectGender(String gender) {
        switch (gender) {
            case "Male":
                practiceFormPage.getRadioBtnMale().click();
                break;
            case "Female":
                practiceFormPage.getRadioBtnFemale().click();
                break;
            default:
                practiceFormPage.getRadioBtnOther().click();
                break;
        }
    }
}
