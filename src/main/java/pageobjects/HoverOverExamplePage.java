package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HoverOverExamplePage extends BasePage{
    public HoverOverExamplePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "onmouseover")
    private WebElement btnHoverable;

    @FindBy(how = How.ID, using = "onmouseoverstatus")
    private WebElement pHoverMouseStatus;

    public WebElement getBtnHoverable() {
        return btnHoverable;
    }

    public WebElement getpHoverMouseStatus() {
        return pHoverMouseStatus;
    }
}
