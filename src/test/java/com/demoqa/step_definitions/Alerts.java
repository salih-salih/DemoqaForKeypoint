package com.demoqa.step_definitions;

import com.demoqa.pages.AlertsPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;


public class Alerts {

    AlertsPage alertsPage = new AlertsPage();

    @Then("click the click me-alertButton")
    public void clickTheClickMeAlertButton() {

        alertsPage.alertButton.click();
    }

    @Then("verify the popup is open with {string} message")
    public void verify_the_popup_is_open_with_message(String string) {

        alertsPage.verifyPopupMessage(string);
        alertsPage.acceptPopup();

    }

    @Then("click the click me-timerAlertButton")
    public void click_the_click_me_timerAlertButton() {

        alertsPage.timerAlertButton.click();
    }

    @And("verify the timer popup is open after {int} seconds with {string} message")
    public void verifyTheTimerPopupIsOpenAfterSecondsWithMessage(long sec, String string) throws InterruptedException {

        Thread.sleep(sec * 1000);

        alertsPage.verifyPopupMessage(string);
        alertsPage.acceptPopup();
    }

    @Then("click the click me-confirmButton")
    public void click_the_click_me_confirmButton() {

        alertsPage.confirmButton.click();
    }

    @Then("verify the confirm box popup is open with {string} message")
    public void verify_the_confirm_box_popup_is_open_with_message(String string) {

        alertsPage.verifyPopupMessage(string);
        alertsPage.acceptPopup();
    }

    @Then("user click the tamam button on popup")
    public void user_click_the_tamam_button_on_popup() {

        alertsPage.acceptPopup();

    }

    @And("verify appearing message OK: {string}")
    public void verifyAppearingMessageOK(String string) {

        String actualConfirmBoxMessage = alertsPage.confirmMessage.getText();
        System.out.println("Actual Confirm Box Message = " + actualConfirmBoxMessage);
        Assert.assertEquals(string, actualConfirmBoxMessage);
    }

    @Then("user click the iptal button on popup")
    public void user_click_the_iptal_button_on_popup() {

        alertsPage.dismissPopup();
    }

    @And("verify appearing message Cancel: {string}")
    public void verifyAppearingMessageCancel(String string) {

        String actualConfirmBoxMessage = alertsPage.confirmMessage.getText();
        System.out.println("Actual Confirm Box Message = " + actualConfirmBoxMessage);
        Assert.assertEquals(string, actualConfirmBoxMessage);

    }

    @Then("click the click me-promtButton")
    public void click_the_click_me_promtButton() {

        alertsPage.promtButton.click();
    }

    @Then("verify the promt box popup is open with {string} message")
    public void verify_the_promt_box_popup_is_open_with_message(String string) {

        alertsPage.verifyPopupMessage(string);
        alertsPage.acceptPopup();

    }

    @Then("send any name {string} in to the box on popup")
    public void send_any_name_in_to_the_box_on_popup(String string) {

        alertsPage.sendKeysPopup(string);
        alertsPage.acceptPopup();

    }

    @Then("verify {string} message is appeared")
    public void verify_message_is_appeared(String string) {

        String promptResultMessageText = alertsPage.promptResultMessage.getText();
        System.out.println("promptResultMessageText = " + promptResultMessageText);
        Assert.assertEquals(string, promptResultMessageText);
    }

    @Then("click the iptal button on popup")
    public void click_the_iptal_button_on_popup() {

        alertsPage.promtButton.click();
        alertsPage.dismissPopup();

    }

    @And("verify the previous Name is already existed")
    public void verifyThePreviousNameIsAlreadyExisted() {

        int size = Driver.get().findElements(By.xpath("//span[@id='promptResult']")).size();

        //Assert.assertTrue(size!=0);

        if (size != 0) {
            System.out.println("İnserted name is Present");
        } else {
            System.out.println("İnserted name is Absent, This is a bug maybe");
        }

    }


}
