package auto.carrito.compra.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theHomePage() {
        return Task.where("{0} opens the home page Demo Blaze",
                Open.browserOn().the(DemoBlazePage.class));
    }
}
