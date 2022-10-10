package com.utest.reto.questions;

import com.utest.reto.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyWelcome implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
    public static Question<String> verifyWelcome()
    {return actor -> UtestRegisterPage.BTN_WELCOME.resolveFor(actor).getTextValue(); }
}
