package com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {

    public static final Target LBL_NAME = Target.the("Label nombres").located(By.id("firstName"));
    public static final Target LBL_LASTNAME = Target.the("Label nombres").located(By.id("lastName"));
    public static final Target LBL_EMAIL = Target.the("Label nombres").located(By.id("email"));
    public static final Target LIST_MONTH = Target.the("lista meses").located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("lista dias").located(By.xpath("//*[@id='birthDay']"));
    public static final Target LIST_YEAR = Target.the("lista años").located(By.xpath("//*[@id='birthYear']"));

    public static final Target BTN_NEXT_LOCATION = Target.the("boton next location").located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

    public static final Target BTN_NEXT_DEVICES = Target.the("boton next devices").located(By.xpath("//a[contains(@ng-click,'validateAddressInfoStep(forms.userForm)')]"));

    public static final Target BTN_LAST_STEP = Target.the("boton last steps").located(By.xpath("//*[span=\"Next: Last Step\"]"));

    public static final Target LBL_PASSWORD = Target.the("Label nombres").located(By.id("password"));
    public static final Target LBL_CONFIRM_PASSWORD = Target.the("Label nombres").located(By.id("confirmPassword"));
    public static final Target CHK_BOX_STAY_INFORMED = Target.the("check box opcional").located(By.xpath("//span[contains(@class, 'checkmark signup-consent__checkbox signup-consent__checkbox--highlight')]"));
    public static final Target CHK_BOX_ACEPT_TERMS = Target.the("check box aceptar terminos").located(By.xpath("//*[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target CHK_BOX_ACEPT_PRIVACY = Target.the("check box aceptar privacidad").located(By.xpath("//*[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target BTN_COMPLETE = Target.the("Label nombres").located(By.id("laddaBtn"));
    public static final Target TXT_WELCOME = Target.the("Mensaje bienvenida").located(By.xpath("//p[@class='welcome-lead']"));

}
