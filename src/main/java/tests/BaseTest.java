package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;

public class BaseTest {

    public WebDriver driver = getDriver();

    private WebDriver getDriver() {
        setupDriver("firefox");
        //This is to work with Julio's class (remove comment if needed)
        //driver.get("https://www.github.com");
        //This is to work with Jenny's class
        driver.get("https://demoqa.com/automation-practice-form");
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
        //setupDriver("chrome");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }

    private void setupDriver(String browserName) {
        switch(browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/jxr20920/Downloads/geckodriver_");
                //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Web Driver was not found in directory");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }
}
