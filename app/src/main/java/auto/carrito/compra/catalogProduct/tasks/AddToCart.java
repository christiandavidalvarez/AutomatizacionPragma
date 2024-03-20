package auto.carrito.compra.catalogProduct.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import auto.carrito.compra.ui.HomePage;
import auto.carrito.compra.ui.ProductPage;
import auto.carrito.compra.utils.ClickWithJavaScript;

import java.time.Duration;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;


public class AddToCart {

    public static Performable waiForAlert(){
        return Task.where("wait alert message", actor -> {
            WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.alertIsPresent());
        });
    }

    public static Performable theProduct(String item) {
        return Task.where("{0} select product",
                ClickWithJavaScript.onElement(HomePage.ITEM_PRODUCT.of(item)),
                Click.on(ProductPage.ADD_TO_CART),
                waiForAlert(),
                Switch.toAlert().andAccept());
    }
}
