package com.utest.reto.tasks;

import com.utest.reto.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.reto.userinterface.UtestRegisterPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {


    public static Register newUser() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Ayath").into(LBL_NAME));
        actor.attemptsTo(Enter.theValue("Giraldo").into(LBL_LASTNAME));
        actor.attemptsTo(Enter.theValue("pruebachoucair08212022@yopmail.com").into(LBL_EMAIL));
        actor.attemptsTo(SelectFromOptions.byValue("number:2").from(LIST_MONTH));
        actor.attemptsTo(SelectFromOptions.byValue("number:12").from(LIST_DAY));
        actor.attemptsTo(SelectFromOptions.byValue("number:2000").from(LIST_YEAR));
        actor.attemptsTo(Click.on(BTN_NEXT_LOCATION));
        actor.attemptsTo(Click.on(BTN_NEXT_DEVICES));
        actor.attemptsTo(WaitUntil.the(BTN_LAST_STEP, isVisible()));
        actor.attemptsTo(Click.on(BTN_LAST_STEP));
        actor.attemptsTo(Enter.theValue("ContraseñaReto1*").into(LBL_PASSWORD));
        actor.attemptsTo(Enter.theValue("ContraseñaReto1*").into(LBL_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(CHK_BOX_STAY_INFORMED));
        actor.attemptsTo(Click.on(CHK_BOX_ACEPT_TERMS));
        actor.attemptsTo(Click.on(CHK_BOX_ACEPT_PRIVACY));
        actor.attemptsTo(Click.on(BTN_COMPLETE));
        actor.attemptsTo(WaitUntil.the(TXT_WELCOME, isVisible()));

    }
}
