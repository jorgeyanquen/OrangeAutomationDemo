package com.screenplay.practicados.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class NewUserOrangePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public WebElementFacade btnPIM;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
    public WebElementFacade btnaddEmployee;

    public void botonpim(){
        btnPIM.click();
    }
    public void botonemployee(){
        btnaddEmployee.click();
    }

}
