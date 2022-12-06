import Steps.ElementsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest {

    ElementsSteps elementsSteps = new ElementsSteps(_driver);

    @Test
    public void HelloWorldTest() {
        WebElement testTextBox = _driver.findElement(By.xpath("example_xpath"));
        String url = _driver.getCurrentUrl();
        String view = "Search view";
        CustomAssertions.isElementDisplayed(testTextBox.isDisplayed(), url, view);
    }

    @Test (description = "Testing that the URL is as expected", groups = "SmokeSuite", priority = 1)
    public void TestURLisCorrect () {
        String expectedURL = "https://www.github.com/";
        String actualURL = _driver.getCurrentUrl();

        CustomAssertions.isURLValid(expectedURL, actualURL);
    }

    @Test (description = "Testing that the page title is as expected")
    public void testGitHubPageTile() {
        String titleExpected = "GitHub";
        String titleActual = _driver.getTitle();
        CustomAssertions.isTitleValid(titleExpected, titleActual);
    }

    @Test (description = "Testing negative scenario for page title as expected", groups = "SmokeSuite", priority = 2)
    public void testGitHubPageTitleNegative () {
        String titleExpected = "GITHUB";
        String titleActual = elementsSteps.getTitle();
        CustomAssertions.isTitleValidNegative(titleExpected, titleActual);
    }

}
