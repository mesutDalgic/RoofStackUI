package com.RoofStack.Pages;

import com.RoofStack.Utils.ConfigReader;
import com.RoofStack.Utils.MethodBox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadProductTesterPage extends HomePage{
    @FindBy(xpath = "//small[.=' Send CV ']")
    public WebElement sendCv;

    @FindBy(css = "#email")
    public WebElement emailInput;

    @FindBy(css = "#file")
    public WebElement chooseFile;

    @FindBy(xpath="//input[@id='btn_upload']")
    public WebElement upload;

    @FindBy(xpath = "//*[@style='width: 100%;']")
    public WebElement isUploaded;

    public void dosyaYukle() {
        chooseFile.sendKeys(ConfigReader.get("dosya_yolu"));
        upload.click();
        MethodBox.waitFor(5);
    }
}
