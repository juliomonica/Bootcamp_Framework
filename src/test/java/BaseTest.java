import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver _driver = get_driver();

    private WebDriver get_driver() {
        System.setProperty("webdriver.firefox.driver", "/Users/jxr20920/Downloads/geckodriver_");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.github.com");
        return driver;
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is the before test");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        _driver.quit();
    }
}
