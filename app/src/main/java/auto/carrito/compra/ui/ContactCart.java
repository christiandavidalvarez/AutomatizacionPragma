package auto.carrito.compra.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ContactCart {

    public static final Target BUTTON_CONTACT= Target.the("button contact").located(By.cssSelector("#navbarExample > ul > li:nth-child(2)"));

    public static final Target INPUT_EMAIL= Target.the("input email").located(By.id("recipient-email"));

    public static final Target INPUT_CONTACT_NAME= Target.the("input email").located(By.id("recipient-name"));

    public static final Target INPUT_MESSAGE= Target.the("input email").located(By.id("message-text"));

    public static final Target BUTTON_SEND_MESSAGE=  Target.the("input email").located(By.cssSelector("#exampleModal button.btn.btn-primary"));   

}
