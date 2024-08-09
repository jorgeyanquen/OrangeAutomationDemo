package com.screenplay.practicados.Steps;

import com.screenplay.practicados.pages.UpdateUserOrangePage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class UpdateUserOrangeStep {

    UpdateUserOrangePage updateUserOrangePage;

    @Step
    public void updateuser(List<List<String>> data, int id){
        updateUserOrangePage.botonpim();
        updateUserOrangePage.botonlistemployee();
        updateUserOrangePage.idemployee(data.get(id).get(0).trim());
        updateUserOrangePage.botonsearch();
        updateUserOrangePage.botonselect();
        updateUserOrangePage.botonedit();
        updateUserOrangePage.licencedriver(data.get(id).get(1).trim());
        updateUserOrangePage.licencedate(data.get(id).get(2).trim());
        updateUserOrangePage.datebirth(data.get(id).get(3).trim());
        updateUserOrangePage.botonselectsex();
        updateUserOrangePage.botonsave2();


    }

    @Step
    public void verificar_ingreso_datos_formulario_exitoso(){
        updateUserOrangePage.form_sin_errores();
    }
}
