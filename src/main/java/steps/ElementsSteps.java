package steps;

import org.openqa.selenium.WebDriver;

public class ElementsSteps extends BaseSteps {

    public ElementsSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTitle() {
        return  webDriver.getTitle();
    }
}
