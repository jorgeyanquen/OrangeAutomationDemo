package com.screenplay.practicados.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class NewUserOrangePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public WebElementFacade btnPIM;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
    public WebElementFacade btnaddEmployee;

    @FindBy(name = "firstName")
    public WebElementFacade txtfirstName;

    @FindBy(name = "middleName")
    public WebElementFacade txtmiddleName;

    @FindBy(name = "lastName")
    public WebElementFacade txtlastName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    public WebElementFacade txtemployee;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElementFacade btnsave;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6")
    public WebElementFacade lblvalidacion;


    public void botonpim(){
        btnPIM.click();
    }
    public void botonemployee(){
        btnaddEmployee.click();
    }

    public void firstName(String datoPrueba){
        txtfirstName.click();
        txtfirstName.clear();
        txtfirstName.sendKeys(datoPrueba);
    }

    public void middleName(String datoPrueba){
        txtmiddleName.click();
        txtmiddleName.clear();
        txtmiddleName.sendKeys(datoPrueba);
    }

    public void lastName(String datoPrueba){
        txtlastName.click();
        txtlastName.clear();
        txtlastName.sendKeys(datoPrueba);
    }

    public void botonsave(){
        btnsave.click();
    }
    public void validacionlbl(){
        String strMensaje = lblvalidacion.getText();
        assertThat(strMensaje, containsString("Juan Perez"));
    }

}
