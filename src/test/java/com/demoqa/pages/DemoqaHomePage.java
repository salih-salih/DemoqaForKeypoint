package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoqaHomePage extends BasePage {

    // modules

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    public WebElement Elements;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][2]")
    public WebElement Forms;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][3]")
    public WebElement AlertsFrameWindowsModule;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][4]")
    public WebElement Widgets;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][5]")
    public WebElement Interactions;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][6]")
    public WebElement BookStoreApplication;


}
