package pageobjects;

import org.openqa.selenium.WebDriver;

//POM -> Page Object Model Base
public class BasePage {
    WebDriver _webDriver;

    public BasePage (WebDriver webDriver) {
        this._webDriver = webDriver;
    }

    
}
