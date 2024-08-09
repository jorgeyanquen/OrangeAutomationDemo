package com.screenplay.practicados.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UpdateUserOrangePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public WebElementFacade btnPIM;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
    public WebElementFacade btnlistEmployee;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")
    public WebElementFacade txtidEmployee;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public WebElementFacade btnsearch;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div/label/span")
    public WebElementFacade btnselect;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]")
    public WebElementFacade btnedit;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
    public WebElementFacade txtlicence;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
    public WebElementFacade txtdatelicence;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    public WebElementFacade txtdatebirth;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
    public WebElementFacade btnselectsex;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
    public WebElementFacade btnsave2;

    @FindBy(id = "oxd-toaster_1")
    public WebElementFacade globovalidacion;

    public void botonpim(){
        btnPIM.click();
    }
    public void botonlistemployee(){
        btnlistEmployee.click();
    }

    public void idemployee(String datoPrueba){
        txtidEmployee.click();
        txtidEmployee.clear();
        txtidEmployee.sendKeys(datoPrueba);

    }
    public void botonsearch(){
        btnsearch.click();
    }
    public void botonselect(){
        btnselect.click();
    }

    public void botonedit(){
        btnedit.click();
    }
    public void licencedriver(String datoPrueba){
        txtlicence.click();
        txtlicence.clear();
        txtlicence.sendKeys(datoPrueba);
    }

    public void licencedate(String datoPrueba){
        txtdatelicence.click();
        txtdatelicence.clear();
        txtdatelicence.sendKeys(datoPrueba);
    }

    public void datebirth(String datoPrueba){
        txtdatebirth.click();
        txtdatebirth.clear();
        txtdatebirth.sendKeys(datoPrueba);
    }

    public void botonselectsex(){
        btnselectsex.click();
    }

    public void botonsave2(){
        btnsave2.click();
    }

    public void form_sin_errores(){
        assertThat(globovalidacion.isCurrentlyVisible(),is(false));
    }

}
