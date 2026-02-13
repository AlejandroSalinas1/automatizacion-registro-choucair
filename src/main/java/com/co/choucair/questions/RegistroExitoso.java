package com.co.choucair.questions;

import com.co.choucair.userinterfaces.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.choucair.userinterfaces.RegistroPage.INPUT_LBL_CONFIMACION;

public class RegistroExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return INPUT_LBL_CONFIMACION.resolveFor(actor).isVisible();

    }
    public static RegistroExitoso es(){
        return new RegistroExitoso();
    }
}
