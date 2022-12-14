package com.utest.reto.stepsdefinitions;

/*import com.utest.reto.questions.Answer;*/
import com.utest.reto.questions.VerifyWelcome;
import com.utest.reto.tasks.OpenUp;
import com.utest.reto.tasks.GoToRegister;
import com.utest.reto.tasks.Register;
import com.utest.reto.userinterface.UtestRegisterPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.utest.reto.questions.VerifyWelcome.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;


public class UtestStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^I want to register on Utest Web Page$")

    public void iWantToRegisterOnUtestWebPage() {
        theActorCalled("ayath").wasAbleTo(OpenUp.thePage(), GoToRegister.onThePage());
    }

    @When("^I Put my dates to create my account$")
    public void iPutMyDatesToCreateMyAccount() {
        theActorInTheSpotlight().attemptsTo(Register.newUser());
    }

    @Then("^I validate the welcome page for new users$")
    public void iValidateTheWelcomePageForNewUsers() {
    theActorInTheSpotlight().should(seeThat("the welcome message", verifyWelcome(), equalTo("We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world! First, please check your email inbox to confirm your email address and complete your uTest registration.Next, we have gathered the following useful information to help you get started.")));
    }







/*@Then("^I validate the welcome page for new users$")
    public void iValidateTheWelcomePageForNewUsers() {
String txtwelcome = "We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world! First, please check your email inbox to confirm your email address and complete your uTest registration.\n\nNext, we have gathered the following useful information to help you get started.";
theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWelcome.verifyWelcome(), Matchers.equalTo(txtwelcome)));
}*/

}
