import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isElementDisplayed (Boolean isElementDisplayed, String view, String url) {
        String errorMessage = "The element is not displayed "
                + " in " + url + " and in view " + view;
        Assert.assertTrue(isElementDisplayed, errorMessage);
    }

    public static void isURLValid (String expectedURL, String currentURL) {
        String errorMessage = "URL " + currentURL + " is not as expected. Expected was: " + expectedURL;
        Assert.assertEquals(currentURL, expectedURL, errorMessage);
    }
}
