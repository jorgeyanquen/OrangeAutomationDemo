package com.screenplay.practicados.Steps;

import com.screenplay.practicados.pages.NewUserOrangePage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class NewUserOrangeStep {

    NewUserOrangePage newUserOrangePage;


    @Step
    public void adduser(List<List<String>> data, int id){
        newUserOrangePage.botonpim();
        newUserOrangePage.botonemployee();
    }
}
