package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage{
    public static final Target INPUT_FIRST_NAME = Target.the("campo Firts Name").locatedBy("//input[@id='FirstName']");
    public static final Target INPUT_LAST_NAME = Target.the("campo Last Name").locatedBy("//input[@id='LastName']");
    public static final Target INPUT_EMAIL = Target.the("campo Email").locatedBy("//input[@id='Email']");
    public static final Target INPUT_PASSWORD = Target.the("campo Password").locatedBy("//input[@id='Password']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("campo Confirm Password").locatedBy("//input[@id='ConfirmPassword']");
    public static final Target INPUT_BTN_SUBMIT = Target.the("boton Submit").locatedBy("//input[@id='register-button']");
    public static final Target INPUT_LBL_CONFIMACION = Target.the("mensaje de confirmación").located(By.className("result"));

}