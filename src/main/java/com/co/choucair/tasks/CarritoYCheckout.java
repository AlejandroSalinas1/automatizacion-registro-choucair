package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.Tasks;
import com.co.choucair.userinterfaces.CompraPage;

public class CarritoYCheckout implements Task {

    private final String pais;

    public CarritoYCheckout(String pais) {
        this.pais = pais;
    }

    public static CarritoYCheckout seleccionarPais(String pais) {
        return Tasks.instrumented(CarritoYCheckout.class, pais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CompraPage.BTN_SHOPPING_CART),
                Click.on(CompraPage.BTN_SHOPPING_CART),
                Scroll.to(CompraPage.SELECT_COUNTRY),
                SelectFromOptions.byVisibleText(pais).from(CompraPage.SELECT_COUNTRY),
                Click.on(CompraPage.CHECKBOX_TOS),
                Click.on(CompraPage.BTN_CHECKOUT)
        );
    }
}