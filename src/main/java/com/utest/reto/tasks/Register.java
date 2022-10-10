package com.utest.reto.tasks;

import com.utest.reto.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {


    public static Register newUser() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Ayath").into(UtestRegisterPage.LBL_NAME));
        actor.attemptsTo(Enter.theValue("Giraldo").into(UtestRegisterPage.LBL_LASTNAME));
        actor.attemptsTo(Enter.theValue("pruebachoucair19102022@yopmail.com").into(UtestRegisterPage.LBL_EMAIL));
        actor.attemptsTo(SelectFromOptions.byValue("number:2").from(UtestRegisterPage.LIST_MONTH));
        actor.attemptsTo(SelectFromOptions.byValue("number:12").from(UtestRegisterPage.LIST_DAY));
        actor.attemptsTo(SelectFromOptions.byValue("number:2000").from(UtestRegisterPage.LIST_YEAR));
        actor.attemptsTo(Click.on(UtestRegisterPage.BTN_NEXT_LOCATION));
        actor.attemptsTo(Click.on(UtestRegisterPage.BTN_NEXT_DEVICES));
        actor.attemptsTo(Click.on(UtestRegisterPage.BTN_LAST_STEP));
        actor.attemptsTo(Enter.theValue("ContraseñaReto1*").into(UtestRegisterPage.LBL_PASSWORD));
        actor.attemptsTo(Enter.theValue("ContraseñaReto1*").into(UtestRegisterPage.LBL_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(UtestRegisterPage.CHK_BOX_STAY_INFORMED));
        actor.attemptsTo(Click.on(UtestRegisterPage.CHK_BOX_ACEPT_TERMS));
        actor.attemptsTo(Click.on(UtestRegisterPage.CHK_BOX_ACEPT_PRIVACY));
        actor.attemptsTo(Click.on(UtestRegisterPage.BTN_COMPLETE));

    }
}
