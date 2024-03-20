package auto.carrito.compra.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;

public class ClickWithJavaScript implements Task {

    private final Target targetElement;

    public ClickWithJavaScript(Target targetElement) {
        this.targetElement = targetElement;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(targetElement)
        );
    }

    public static Performable onElement(Target targetElement) {
        return new ClickWithJavaScript(targetElement);
    }
}