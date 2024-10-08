package com.screenplay.practicados;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.screenplay.practicados.definitions",
        tags = "@CasoExitosoActualizacion"
)
public class Runner {
}
