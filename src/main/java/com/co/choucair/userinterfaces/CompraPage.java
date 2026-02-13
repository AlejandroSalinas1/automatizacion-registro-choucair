package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraPage {

    public static final Target BTN_LOGIN = Target.the("botón de login").located(By.id("login-button"));
    public static final Target INPUT_EMAIL = Target.the("campo email").located(By.id("Email"));
    public static final Target INPUT_PASSWORD = Target.the("campo password").located(By.id("Password"));
    public static final Target BTN_SUBMIT_LOGIN = Target.the("botón submit login").located(By.id("login-submit"));

    public static final Target MENU_COMPUTERS = Target.the("menu computers").located(By.linkText("Computers"));
    public static final Target SUBMENU_DESKTOPS = Target.the("submenu desktops").located(By.linkText("Desktops"));

    public static final Target PRIMER_PRODUCTO = Target.the("primer producto de la lista").located(By.cssSelector(".product-item:first-child a"));
    public static final Target BTN_ADD_TO_CART = Target.the("botón add to cart").located(By.id("add-to-cart-button"));

    public static final Target BTN_SHOPPING_CART = Target.the("botón shopping cart").located(By.linkText("Shopping cart"));
    public static final Target SELECT_COUNTRY = Target.the("select country").located(By.id("BillingNewAddress_CountryId"));
    public static final Target CHECKBOX_TOS = Target.the("checkbox terms of service").located(By.id("termsofservice"));
    public static final Target BTN_CHECKOUT = Target.the("botón checkout").located(By.id("checkout"));
}
