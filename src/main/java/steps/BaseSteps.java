package steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    WebDriver webDriver;

    public BaseSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
