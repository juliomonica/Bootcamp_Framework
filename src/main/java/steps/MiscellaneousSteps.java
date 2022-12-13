package steps;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.DragDropExamplePage;
import pageobjects.DropDownExamplePage;
import pageobjects.HoverOverExamplePage;

public class MiscellaneousSteps extends BaseSteps{

    DragDropExamplePage w3SchoolsDragDrop = PageFactory.initElements(webDriver, DragDropExamplePage.class);
    HoverOverExamplePage hoverOverExample = PageFactory.initElements(webDriver, HoverOverExamplePage.class);
    DropDownExamplePage dropDownExamplePage = PageFactory.initElements(webDriver, DropDownExamplePage.class);

    public MiscellaneousSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void dragDivIntoDiv() {
        System.out.println("Dragging yellow div and dropping into red div");
        dragWebElement(w3SchoolsDragDrop.getDivDraggable(), w3SchoolsDragDrop.getDivContainer());
    }

    public void scrollToButtonExample() {
        scrollToWebElement(hoverOverExample.getBtnHoverable());
    }

    public void hoverOverButtonExample() {
        hoverOverWebElement(hoverOverExample.getBtnHoverable());
    }

    public String getHoverStatus() {
        return getElementText(hoverOverExample.getpHoverMouseStatus());
    }

    public void selectSearchEngine(String text) {
        System.out.println("Attempting to select option: " + text);
        selectFromDropDownByText(dropDownExamplePage.getDropDownFirst(), text);
    }

    public void selectSearchEngineByIndex(int index) {
        System.out.println("Attempting to select by index: " + index);
        selectFromDropDownByIndex(dropDownExamplePage.getDropDownFirst(), index);
    }

    public String getSelectedSearchEngine() {
        return getDropDownSelectedOption(dropDownExamplePage.getDropDownFirst());
    }
}
