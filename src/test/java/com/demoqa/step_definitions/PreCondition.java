package com.demoqa.step_definitions;

import com.demoqa.pages.AlertsPage;
import com.demoqa.pages.DemoqaHomePage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PreCondition {

    AlertsPage alertsPage = new AlertsPage();
    DemoqaHomePage demoqaHomePage = new DemoqaHomePage();


    @Given("verify user on demoqa.com")
    public void verify_user_on_demoqa_com() {

        Driver.get().get(ConfigurationReader.get("url"));
        System.out.println("title = " + Driver.get().getTitle());

        Assert.assertEquals("ToolsQA", Driver.get().getTitle());

    }

    @When("user click the Alert,Frame,Windows module")
    public void user_click_the_Alert_Frame_Windows_module() {

        Driver.get().get(ConfigurationReader.get("url"));
        demoqaHomePage.AlertsFrameWindowsModule.click();

    }

    @When("verify Alert,Frame,Windows menu is open")
    public void verify_Alert_Frame_Windows_menu_is_open() {

        String aClass = alertsPage.AlertsFrameWindowsMenu.getAttribute("class");
        String expectedAttribute = "element-list collapse show";
        Assert.assertEquals(expectedAttribute, aClass);

    }

    @Then("user click the Alerts button under menu")
    public void user_click_the_Alerts_button_under_menu() {

        alertsPage.AlertsButton.click();

    }


}
