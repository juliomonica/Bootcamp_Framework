package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DropDownExamplePage extends BasePage{

    public DropDownExamplePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//select[@id='first']")
    private WebElement dropDownFirst;

    public WebElement getDropDownFirst() {
        return dropDownFirst;
    }
}
