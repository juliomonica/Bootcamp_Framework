package Steps;


import org.openqa.selenium.WebDriver;

public class BaseSteps {
    WebDriver _webDriver;
    public BaseSteps (WebDriver webDriver) {
        this._webDriver = webDriver;
    }
}
