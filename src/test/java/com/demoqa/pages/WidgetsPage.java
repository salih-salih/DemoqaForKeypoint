package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends BasePage{

    /*
    Widgets ( click tool Tips button, hover over the “Hover me to see”
    button and verify the “You Hovered Over the button” message then hover over the
    “Hover me to see” text field and verify “You hovered the text field” message.
     */

    @FindBy(xpath = "(//ul[@class='menu-list'])[4]/li[7]")
    public WebElement toolTipsButton;

    @FindBy(xpath = "//button[@id='toolTipButton']")
    public WebElement hoverMeToSeeButton;

    @FindBy(xpath = "//input[@id='toolTipTextField']")
    public WebElement hoverMeToSeeTextField;

    @FindBy(className = "tooltip-inner") //       xpath://div[@class='tooltip-inner']
    public WebElement hoverMessage;



}
