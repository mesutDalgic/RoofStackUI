package com.RoofStack.Pages;

import com.RoofStack.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[@title='Career']")
    public WebElement carreerLink;

}
