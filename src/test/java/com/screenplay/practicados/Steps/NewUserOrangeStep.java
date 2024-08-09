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
        newUserOrangePage.firstName(data.get(id).get(0).trim());
        newUserOrangePage.middleName(data.get(id).get(1).trim());
        newUserOrangePage.lastName(data.get(id).get(2).trim());
        newUserOrangePage.botonsave();

    }

    @Step
    public void validacion(){
        newUserOrangePage.validacionlbl();
    }
}
