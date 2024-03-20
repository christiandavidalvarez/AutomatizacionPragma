package auto.carrito.compra.contact.tasks;

import static auto.carrito.compra.enums.ContacDataEnum.*;

import java.util.Map;

import auto.carrito.compra.ui.ContactCart;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ContactPopUp {

    public static Performable activePopUp() {
        return Task.where("{0} active the pop up",
                 Click.on(ContactCart.BUTTON_CONTACT)); 
    }

    public static Performable fillContactInfo(Map<String, String> contactData) {
        return Task.where("{0} fill contact",
        Enter.theValue(contactData.get(EMAIL.name())).into(ContactCart.INPUT_EMAIL),
        Enter.theValue(contactData.get(CONTACT_NAME.name())).into(ContactCart.INPUT_CONTACT_NAME),
        Enter.theValue(contactData.get(MESSAGE.name())).into(ContactCart.INPUT_MESSAGE),
        Click.on(ContactCart.BUTTON_SEND_MESSAGE));
    }

}
