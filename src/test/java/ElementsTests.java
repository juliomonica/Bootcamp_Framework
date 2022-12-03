import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTests {
    WebDriver _driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "/Users/jxr20920/Downloads/chromedriver");
        this._driver = new ChromeDriver();
        this._driver.get("https://www.github.com");
    }

    @Test
    public void HelloWorldTest() {
        WebElement testTextBox = _driver.findElement(By.xpath("example_xpath"));
        String url = _driver.getCurrentUrl();
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test
    public void TestURLisCorrect () {
        String expectedURL = "https://www.github.com/";
        String actualURL = _driver.getCurrentUrl();

        CustomAssertions.isURLValid(expectedURL, actualURL);
    }

    @AfterMethod
    public void tearDown() {
        _driver.quit();
    }
}
