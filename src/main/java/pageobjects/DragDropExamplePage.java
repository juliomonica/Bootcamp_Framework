package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DragDropExamplePage extends BasePage {
    @FindBy(how = How.ID, using = "draggable1")
    private WebElement divDraggable;

    @FindBy(how = How.ID, using = "droppable1")
    private WebElement divContainer;

    public DragDropExamplePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getDivDraggable() {
        return divDraggable;
    }

    public WebElement getDivContainer() {
        return divContainer;
    }
}
