package com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class Utestpage extends PageObject {
    public static final Target BTN_REGISTER = Target.the("boton enjoy now").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
