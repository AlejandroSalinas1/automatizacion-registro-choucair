package com.co.choucair.questions;

import net.serenitybdd.screenplay.Question;
import com.co.choucair.userinterfaces.CompraPage;

public class ResumenCompra {

    public static Question<Boolean> esVisible() {
        return actor -> CompraPage.BTN_CHECKOUT.resolveFor(actor).isDisplayed();
    }
}