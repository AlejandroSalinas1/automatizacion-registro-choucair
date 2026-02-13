package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RellenarFormulario implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public RellenarFormulario(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = lastName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroPage.INPUT_FIRST_NAME),
                Enter.theValue(firstName).into(RegistroPage.INPUT_FIRST_NAME),

                Click.on(RegistroPage.INPUT_LAST_NAME),
                Enter.theValue(lastName).into(RegistroPage.INPUT_LAST_NAME),

                Click.on(RegistroPage.INPUT_EMAIL),
                Enter.theValue(email).into(RegistroPage.INPUT_EMAIL),

                Click.on(RegistroPage.INPUT_PASSWORD),
                Enter.theValue(password).into(RegistroPage.INPUT_PASSWORD),

                Click.on(RegistroPage.INPUT_BTN_SUBMIT)
        );
    }
        public static RellenarFormulario conDatos(String firstName, String lastName, String email, String password){
            return Tasks.instrumented(RellenarFormulario.class, firstName, lastName, email, password);
        }
    }



