package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseSteps {
    WebDriver webDriver;
    Actions customActions;
    JavascriptExecutor js;
    Select customSelect;


    public BaseSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
        this.customActions = new Actions(webDriver);
        js = (JavascriptExecutor) webDriver;
    }

    public void navigateToURL(String url) {
        webDriver.get(url);
    }

    public void dragWebElement(WebElement draggable, WebElement droppable) {
        System.out.println("Action is being performed");
        customActions
                .dragAndDrop(draggable, droppable)
                .perform();
    }

    public void hoverOverWebElement(WebElement hoverable) {
        customActions
                .moveToElement(hoverable)
                .perform();
    }

    public void scrollToWebElement(WebElement scrollTo) {
        if (webDriver instanceof FirefoxDriver) {
            System.out.println("Scrolling in Firefox");
            js.executeScript("arguments[0].scrollIntoView(true);", scrollTo);
        }
        if (webDriver instanceof ChromeDriver) {
            System.out.println("Scrolling in Chrome");
            customActions
                    .scrollToElement(scrollTo)
                    .perform();
        }
    }

    public String getElementText(WebElement elementToGetText) {
        return elementToGetText.getText();
    }

    public void selectFromDropDownByValue(WebElement dropDown, String value) {
        customSelect = new Select(dropDown);
        customSelect.selectByValue(value);
    }

    public void selectFromDropDownByText(WebElement dropDown, String text) {
        System.out.println("Selecting by Visible Text");
        customSelect = new Select(dropDown);
        customSelect.selectByVisibleText(text);
    }

    public void selectFromDropDownByIndex(WebElement dropDown, int index) {
        customSelect = new Select(dropDown);
        customSelect.selectByIndex(index);
    }

    public String getDropDownSelectedOption(WebElement dropDown) {
        customSelect = new Select(dropDown);
        return customSelect
                .getFirstSelectedOption()
                .getText();
    }

}
