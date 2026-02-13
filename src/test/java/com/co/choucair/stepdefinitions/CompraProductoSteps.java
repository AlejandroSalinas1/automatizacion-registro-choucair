package com.co.choucair.stepdefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import org.openqa.selenium.WebDriver;

import com.co.choucair.tasks.LoginProducto;
import com.co.choucair.tasks.SeleccionarYAgregarProducto;
import com.co.choucair.tasks.CarritoYCheckout;
import com.co.choucair.questions.ResumenCompra;

import io.cucumber.datatable.DataTable;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CompraProductoSteps {

    @Managed
    WebDriver navegador;

    Actor actor;

    @Dado("que el usuario está en la página principal")
    public void abrirPagina() {
        actor = Actor.named("usuario");
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(
                Open.url("https://demowebshop.tricentis.com/")
        );
    }

    @Cuando("inicia sesión con los siguientes datos")
    public void iniciarSesion(DataTable table) {
        actor.attemptsTo(
                LoginProducto.conDatos(table)
        );
    }

    @Cuando("selecciona el primer producto en la sección de desktops")
    public void seleccionarProducto() {
        actor.attemptsTo(
                SeleccionarYAgregarProducto.primero()
        );
    }

    @Cuando("lo agrega al carrito")
    public void agregarAlCarrito() {
    }

    @Cuando("va al carrito, selecciona un país, marca la casilla de aceptación y procede al checkout")
    public void carritoCheckout() {
        actor.attemptsTo(
                CarritoYCheckout.seleccionarPais("Colombia")
        );
    }

    @Entonces("debería ver el resumen del checkout")
    public void validarResumen() {
        actor.should(
                seeThat(ResumenCompra.esVisible(), equalTo(true))
        );
    }
}