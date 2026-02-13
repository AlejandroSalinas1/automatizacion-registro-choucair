package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraPage {

    public static final Target BTN_LOGIN = Target.the("botón de login").located(By.className("ico-login"));
    public static final Target INPUT_EMAIL = Target.the("campo email").located(By.id("//input[@id='Email']"));
    public static final Target INPUT_PASSWORD = Target.the("campo password").located(By.id("//input[@id='Password']"));
    public static final Target BTN_SUBMIT_LOGIN = Target.the("botón submit login").located(By.className("button-1 login-button"));
    public static final Target MENU_COMPUTERS = Target.the("menu computers").located(By.className("Computers\n" +
            "        "));
    public static final Target SUBMENU_DESKTOPS = Target.the("submenu desktops").located(By.xpath("//a[@href='/desktops' and text()='Desktops']"));

    public static final Target BTN_ADD_TO_CART = Target.the("botón add to cart").located(By.id("//input[@id='add-to-cart-button-72']"));

    public static final Target BTN_SHOPPING_CART = Target.the("botón shopping cart").located(By.className("cart-label"));
    public static final Target SELECT_COUNTRY = Target.the("select country").located(By.id("//input[@id='CountryId']"));
    public static final Target CHECKBOX_TOS = Target.the("checkbox terms of service").located(By.id("//input[@id='termsofservice']"));
    public static final Target BTN_CHECKOUT = Target.the("botón checkout").located(By.id("//input[@id='checkout']"));
}
