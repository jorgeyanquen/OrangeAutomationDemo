package com.screenplay.practicados.definitions;

import com.screenplay.practicados.Steps.LoginOrangeStep;
import com.screenplay.practicados.Steps.NewUserOrangeStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class OrangeValidationDefinitios {


    @Steps
    LoginOrangeStep loginOrangeStep;

    @Steps
    NewUserOrangeStep newUserOrangeStep;

    @Given("Juan needs to create an employee in OrageHR")
    public void juan_needs_to_create_an_employee_in_orage_hr() {
        loginOrangeStep.login();
    }
    @When("he enters the record in the application")
    public void he_enters_the_record_in_the_application(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();
        for(int i=1; i<cells.size(); i++){
            newUserOrangeStep.adduser(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }
    }
    @Then("he sees the new employee in the application")
    public void he_sees_the_new_employee_in_the_application() {
        newUserOrangeStep.validacion();
    }
}
