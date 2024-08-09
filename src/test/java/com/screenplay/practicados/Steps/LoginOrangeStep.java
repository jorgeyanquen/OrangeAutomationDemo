package com.screenplay.practicados.Steps;

import com.screenplay.practicados.pages.LoginOrangePage;
import net.thucydides.core.annotations.Step;

public class LoginOrangeStep {

    LoginOrangePage loginOrangePage;

    @Step
    public void login(){
        loginOrangePage.open();
        loginOrangePage.loginusername();
        loginOrangePage.loginpassword();
        loginOrangePage.botonlogin();
    }
}
