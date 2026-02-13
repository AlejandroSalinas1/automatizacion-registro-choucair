package com.co.choucair.stepdefinitions;

import com.co.choucair.questions.RegistroExitoso;
import com.co.choucair.tasks.RellenarFormulario;
import com.co.choucair.userinterfaces.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.bouncycastle.math.raw.Nat.equalTo;

public class RegistroUsuarioSteps {
    @Managed
    WebDriver navegador;
    Actor actor;


    @Dado("que el usuario esta en la pagina principal")
    public void queElUsuarioEstaEnLaPaginaPrincipal() {
        actor = Actor.named("usuario");
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(
                Open.url("https://demowebshop.tricentis.com/")
        );
    }

    @Cuando("hace clic en el boton {string} y completa el formulario")
    public void haceClicEnElBotonYCompletaElFormulario(String boton, DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        if (!data.isEmpty()) {
            Map<String, String> row = data.get(0);

            actor.attemptsTo(
                    Click.on(HomePage.BTN_REGISTER),

                    RellenarFormulario.conDatos(
                            row.get("firtsName"),
                            row.get("lastName"),
                            row.get("email"),
                            row.get("password")
                    )
            );
        }
    }

    @Entonces("deberia ver un mensaje de registro exitoso")
    public void DeberiaVerUnMensajeDeRegistroExitoso() {
        actor.should(
                seeThat(RegistroExitoso.es(), equalTo(true))
        );
    }
}

