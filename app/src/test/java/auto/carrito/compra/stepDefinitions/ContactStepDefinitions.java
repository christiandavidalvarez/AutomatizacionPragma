package auto.carrito.compra.stepDefinitions;

import java.util.Map;

import auto.carrito.compra.contact.tasks.ContactPopUp;
import auto.carrito.compra.data.DataFactory;
import auto.carrito.compra.navigation.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class ContactStepDefinitions {

    @Given("{actor} active the contact popup")
    public void sergey_active_the_contact_popup(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
        actor.attemptsTo(ContactPopUp.activePopUp());
    }

    @SuppressWarnings("unchecked")
    @When("{actor} complete the contact information")
    public void he_complete_the_contact_information(Actor actor) {
        Map<String, String> contactData= DataFactory.contactData();
        actor.attemptsTo(ContactPopUp.fillContactInfo(contactData));

    }

    @Then("{actor} see that the message was sended")
    public void he_see_that_the_message_was_sended(Actor actor) {
        actor.attemptsTo(
            Ensure.that(TheWebPage.alertText()).containsIgnoringCase("Thanks for the message!!")
        );
    }

}
