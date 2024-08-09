package com.screenplay.practicados.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginOrangePage extends PageObject {
    @FindBy(name = "username")
    public WebElementFacade txtusername;

    @FindBy(name = "password")
    public WebElementFacade txtpassword;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElementFacade btnlogin;

    public void loginusername(){
        txtusername.click();
        txtusername.clear();
        txtusername.sendKeys("admin");
    }

    public void loginpassword(){
        txtpassword.click();
        txtpassword.clear();
        txtpassword.sendKeys("admin123");
    }

    public void botonlogin(){
        btnlogin.click();
    }

}
