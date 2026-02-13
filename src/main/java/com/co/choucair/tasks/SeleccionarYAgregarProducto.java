package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.Tasks;
import com.co.choucair.userinterfaces.CompraPage;

public class SeleccionarYAgregarProducto implements Task {

    public static SeleccionarYAgregarProducto primero() {
        return Tasks.instrumented(SeleccionarYAgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompraPage.MENU_COMPUTERS),
                Click.on(CompraPage.SUBMENU_DESKTOPS),
                Click.on(CompraPage.PRIMER_PRODUCTO),
                Scroll.to(CompraPage.BTN_ADD_TO_CART),
                Click.on(CompraPage.BTN_ADD_TO_CART)
        );
    }
}
