package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    //Alerts,Frame,Windows menu
    @FindBy(xpath = "//div[@class='element-group'][3]/div")
    public WebElement AlertsFrameWindowsMenu;

    @FindBy(xpath = "(//ul[@class='menu-list'])[3]/li[2]")
    public WebElement AlertsButton;

    //"Click me" buttons
    @FindBy(id = "alertButton")
    public WebElement alertButton;

    @FindBy(id = "timerAlertButton")
    public WebElement timerAlertButton;

    @FindBy(id = "confirmButton")
    public WebElement confirmButton;

    @FindBy(id = "promtButton")
    public WebElement promtButton;

    //message
    @FindBy(id = "confirmResult")
    public WebElement confirmMessage;

    @FindBy(id = "promptResult")
    public WebElement promptResultMessage;

    //methods
    public Alert alert() {

        return Driver.get().switchTo().alert();
    }
    public void verifyPopupMessage(String message) {
        String actualPopupMessage = alert().getText();
        System.out.println("actualPopupMessage = " + actualPopupMessage);
        Assert.assertEquals(message, actualPopupMessage);
    }

    public void sendKeysPopup(String sendName) {
        alert().sendKeys(sendName);
    }

    public void acceptPopup() {
        alert().accept();
    }

    public void dismissPopup() {
        alert().dismiss();
    }


}
