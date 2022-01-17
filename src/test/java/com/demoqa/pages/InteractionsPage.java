package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionsPage extends BasePage{

    /* Interactions (Click droppable button and under the simple module drag the “drag me” box to the   “drop me” box  and verify that dropped.)*/

    @FindBy(xpath = "(//ul[@class='menu-list'])[5]/li[4]")
    public WebElement droppable;

    @FindBy(xpath = "//a[@id='droppableExample-tab-simple']")
    public WebElement simpleTab;

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement draggable;

    @FindBy(xpath = "(//div[@id='droppable'])[1]")
    public WebElement droppableBox;


}
