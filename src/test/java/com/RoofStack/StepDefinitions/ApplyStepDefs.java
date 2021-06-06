package com.RoofStack.StepDefinitions;

import com.RoofStack.Pages.*;
import com.RoofStack.Utils.ConfigReader;
import com.RoofStack.Utils.Driver;
import com.RoofStack.Utils.MethodBox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ApplyStepDefs {

    GooglePage googlePage=new GooglePage();
    HomePage homePage=new HomePage();
    CarreerPage carreerPage=new CarreerPage();
    ProductPage productPage=new ProductPage();
    LeadProductTesterPage leadProductTesterPage=new LeadProductTesterPage();

    @Given("Google’da {string} seklinde arama yapilir")
    public void google_da_seklinde_arama_yapilir(String search) {
        googlePage.searchWithGoogle(search);
    }

    @When("Sonuclar listesinden {string} adresine girilir")
    public void sonuclar_listesinden_adresine_girilir(String string) {
        MethodBox.waitForClickabilility(googlePage.searchedItem,5).click();
    }

    @Then("Kariyer sayfasina gidilir")
    public void kariyer_sayfasina_gidilir() {
        MethodBox.waitForClickabilility(homePage.carreerLink,5).click();
    }

    @Then("Ilanlar arasindan Product pozisyonu secilir")
    public void ilanlar_arasindan_Product_pozisyonu_secilir() {
        MethodBox.waitForClickabilility(carreerPage.productLink,5).click();
    }

    @Then("Lead Product Tester secilir")
    public void lead_Product_Tester_secilir() {
        MethodBox.waitForClickabilility(productPage.leadProductTesterLink,5).click();
    }

    @Then("{string} sayfasinda sayfanin gelip gelmedigi, dogrulugu kontrol edilir")
    public void sayfasinda_sayfanin_gelip_gelmedigi_dogrulugu_kontrol_edilir(String expected) {
        MethodBox.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(expected));
    }

    @Then("SendCV butonuna basarak bir dosya upload edelim")
    public void sendcv_butonuna_basarak_bir_dosya_upload_edelim() {
        MethodBox.waitForClickabilility(leadProductTesterPage.sendCv,5).click();
    }

    @Then("Eposta adresine e-mail adresinizi girelim")
    public void eposta_adresine_e_mail_adresinizi_girelim (){
        leadProductTesterPage.emailInput.sendKeys(ConfigReader.get("email"));
    }

    @Then("Sample bir dosya yukleyelim ve upload butonuna basarak dosyayi paylasalim")
    public void Sample_bir_dosya_yukleyelim_ve_upload_butonuna_basarak_dosyayi_paylasalim() {
        leadProductTesterPage.dosyaYukle();
        Assert.assertTrue(leadProductTesterPage.isUploaded.isDisplayed());
    }

    }


