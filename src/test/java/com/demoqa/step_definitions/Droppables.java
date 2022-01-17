package com.demoqa.step_definitions;

import com.demoqa.pages.DemoqaHomePage;
import com.demoqa.pages.InteractionsPage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Droppables {

    InteractionsPage interactionsPage = new InteractionsPage();
    DemoqaHomePage demoqaHomePage = new DemoqaHomePage();
    Actions actions = new Actions(Driver.get());

    @When("user click the interaction module")
    public void user_click_the_interaction_module() {
        Driver.get().get(ConfigurationReader.get("url"));
        demoqaHomePage.Interactions.click();
    }

    @Then("user click the Droppable buton")
    public void user_click_the_Droppable_buton() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();

        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,100)");

        interactionsPage.droppable.click();
    }

    @Then("user drag the drag me item to drop here box")
    public void user_drag_the_drag_me_item_to_drop_here_box() throws InterruptedException {

        Thread.sleep(2000);
        actions.dragAndDrop(interactionsPage.draggable,interactionsPage.droppableBox).perform();
    }
}
