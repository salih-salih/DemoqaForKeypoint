package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){PageFactory.initElements(Driver.get(),this);}
}
