package com.RoofStack.Pages;

import com.RoofStack.Utils.ConfigReader;
import com.RoofStack.Utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md'][1]")
    public WebElement searchedItem;

    public void searchWithGoogle(String search){
        Driver.get().get(ConfigReader.get("url"));
        searchInputBox.sendKeys(search);
        searchInputBox.sendKeys(Keys.ENTER);
    }
}
