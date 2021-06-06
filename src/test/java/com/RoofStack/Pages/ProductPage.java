package com.RoofStack.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.bind.annotation.W3CDomHandler;

public class ProductPage extends HomePage{
    @FindBy(xpath = "//h4[contains(.,'Lead Product Tester')]")
    public WebElement leadProductTesterLink;

}
