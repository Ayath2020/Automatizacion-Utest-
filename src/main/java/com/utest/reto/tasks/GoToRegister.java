package com.utest.reto.tasks;

import com.utest.reto.userinterface.Utestpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.utest.reto.userinterface.Utestpage.*;

public class GoToRegister implements Task {

    public static GoToRegister onThePage() {
        return Tasks.instrumented(GoToRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BTN_REGISTER));
    }
}
