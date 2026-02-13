package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Tasks;
import com.co.choucair.userinterfaces.CompraPage;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class LoginProducto implements Task {

    private final DataTable table;

    public LoginProducto(DataTable table) {
        this.table = table;
    }

    public static LoginProducto conDatos(DataTable table) {
        return Tasks.instrumented(LoginProducto.class, table);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        Map<String, String> fila = data.get(0);

        actor.attemptsTo(
                Click.on(CompraPage.BTN_LOGIN),
                Enter.theValue(fila.get("email")).into(CompraPage.INPUT_EMAIL),
                Enter.theValue(fila.get("password")).into(CompraPage.INPUT_PASSWORD),
                Click.on(CompraPage.BTN_SUBMIT_LOGIN)
        );
    }
}
