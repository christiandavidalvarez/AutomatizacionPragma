package auto.carrito.compra.navigation;

import auto.carrito.compra.ui.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theHomePage() {
        return Task.where("{0} opens the home page Demo Blaze",
                Open.browserOn().the(DemoBlazeHomePage.class));
    }

    public static Performable thePhonesPage() {
        return Task.where("{0} opens the phones page Demo Blaze",
                Click.on(HomePage.PHONES_BUTTON).afterWaitingUntilEnabled());
    }

    public static Performable theLaptopPage() {
        return Task.where("{0} opens the laptop page Demo Blaze",
                Click.on(HomePage.LATOPS_BUTTON).afterWaitingUntilPresent());
    }

    public static Performable theMonitorsPage() {
        return Task.where("{0} opens the monitors page Demo Blaze",
                Click.on(HomePage.MONITORS_BUTTON).afterWaitingUntilPresent());
    }

    public static Performable theCartPage(){
        return Task.where("{0} go to cart page",
        Click.on(HomePage.CART_LINK).afterWaitingUntilPresent());
    }
}
