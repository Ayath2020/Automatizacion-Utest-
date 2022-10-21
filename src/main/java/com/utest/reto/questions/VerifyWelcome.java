package com.utest.reto.questions;
import com.utest.reto.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import static com.utest.reto.userinterface.UtestRegisterPage.*;


public class VerifyWelcome {
    public static Question<String> verifyWelcome() {
        return actor -> TextContent.of(TXT_WELCOME).viewedBy(actor).asString();
    }
}

/*public class VerifyWelcome implements Question <String> {

    /@Override
    public String answeredBy(Actor actor) {
        return null;
    }
    public static Question<String> verifyWelcome() {
        return actor -> TXT_WELCOME.resolveFor(actor).getTextValue();
    }
}*/
