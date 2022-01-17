package com.demoqa.step_definitions;

import com.demoqa.pages.DemoqaHomePage;
import com.demoqa.pages.WidgetsPage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsHover {

    DemoqaHomePage demoqaHomePage = new DemoqaHomePage();
    WidgetsPage widgetsPage = new WidgetsPage();
    Actions actions = new Actions(Driver.get());

    @When("user click the Widgets module")
    public void user_click_the_Widgets_module() {

        Driver.get().get(ConfigurationReader.get("url"));
        demoqaHomePage.Widgets.click();
    }

    @Then("user click the Tool tips button")
    public void user_click_the_Tool_tips_button() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,250)");
        widgetsPage.toolTipsButton.click();
    }

    @When("hover over the hover me to see button")
    public void hover_over_the_hover_me_to_see_button() throws InterruptedException {


        Thread.sleep(2000);
        actions.moveToElement(widgetsPage.hoverMeToSeeButton).perform();

    }

    @Then("verify {string} message")
    public void verify_message(String string) {

        System.out.println("button message = " + widgetsPage.hoverMessage.getText());
        Assert.assertEquals(string, widgetsPage.hoverMessage.getText());
    }

    @When("hover over the text field hover me to see")
    public void hoverOverTheTextFieldHoverMeToSee() throws InterruptedException {

        Thread.sleep(2000);
        actions.moveToElement(widgetsPage.hoverMeToSeeTextField).perform();
    }

    @Then("verify text field {string} message")
    public void verifyTextFieldMessage(String string) {

        System.out.println("text field message= " + widgetsPage.hoverMessage.getText());
        Assert.assertEquals(string, widgetsPage.hoverMessage.getText());

    }
}
