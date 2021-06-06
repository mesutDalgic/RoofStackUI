package com.RoofStack.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarreerPage extends HomePage{
    @FindBy(xpath = "//h4[.='Product']")
    public WebElement productLink;
}
