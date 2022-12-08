package tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import steps.ElementsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import steps.PracticeFormSteps;
import steps.SignUpSteps;

import java.time.Duration;

public class ElementsTests extends BaseTest {
    ElementsSteps elementsSteps = new ElementsSteps(driver);
    SignUpSteps signUpSteps = new SignUpSteps(driver);
    PracticeFormSteps practiceFormSteps = new PracticeFormSteps(driver);

    @Test
    public void HelloWorldTest() {
        WebElement testTextBox = driver.findElement(By.xpath("example_xpath"));
        String url = driver.getCurrentUrl();
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test(groups = "SmokeSuite")
    public void TestURLisCorrect () {
        String expectedURL = "https://github.com/";
        String actualURL = driver.getCurrentUrl();

        CustomAssertions.isURLValid(expectedURL, actualURL);
    }

    @Test(groups = "SmokeSuite")
    public void TestTitleisCorrect () {
        String expectedURL = "https://github.com/";
        String actualURL = elementsSteps.getTitle();

        CustomAssertions.isURLValid(expectedURL, actualURL);
    }

    @Test(description = "Testing dynamic elements",groups = "SmokeSuite")
    public void TestDynamicProperties () throws InterruptedException {
        //driver.findElement(By.name("q")).sendKeys("userNameOne");
        signUpSteps.clickSignUpLink();
        //Thread.sleep(30000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement txtEmail = new WebDriverWait(driver, Duration.ofSeconds(10)).until(
//                ExpectedConditions.visibilityOfElementLocated(By.xpath(
//                        "//input[@id='email']")));
//        txtEmail.sendKeys("email@github.com");

//        WebElement btnContinue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(
//                ExpectedConditions.elementToBeClickable(By.xpath(
//                        "//button[contains(text(),'Continue')]")));
//        btnContinue.click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("newemail@github.com");

        Wait<WebDriver> waitTwo = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        waitTwo.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//button[contains(text(),'Continue')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

        WebElement txtPassword = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                        "//input[@id='password']")));
        txtPassword.sendKeys("mypa2ssQP$");
        String expectedText = "Password is strong";

        WebElement txtPasswordMessage = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                        "//*[@id='password-err']/p[1]")));

        String actualText = txtPasswordMessage.getText();

        CustomAssertions.isTextEqual(expectedText, actualText);
        //driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

        System.out.println("Test finished");

    }

    @Test(description = "Test to select Male gender in Practice Form")
    public void testSelectMaleGender() {
        practiceFormSteps.selectGender("Male");
    }

    @Test(description = "Test to select Other gender in Practice Form")
    public void testSelectOtherGender() {
        practiceFormSteps.selectGender("Other");
    }
}