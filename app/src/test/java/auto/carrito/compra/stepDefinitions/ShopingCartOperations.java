package auto.carrito.compra.stepDefinitions;

import org.openqa.selenium.support.ui.Sleeper;

import auto.carrito.compra.catalogProduct.questions.TheCartPage;
import auto.carrito.compra.catalogProduct.tasks.AddToCart;
import auto.carrito.compra.catalogProduct.tasks.RemoveToCart;
import auto.carrito.compra.navigation.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ShopingCartOperations {

    private String itemProduct;

    @Given("{actor} is Searching a product in phones_page")
    public void sergey_is_searching_a_product_in_phones_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
        actor.attemptsTo(NavigateTo.thePhonesPage());
    }

    @Given("{actor} is Searching a product in laptop_page")
    public void sergey_is_searching_a_product_in_laptop_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
        actor.attemptsTo(NavigateTo.theLaptopPage());
    }

    @Given("{actor} is Searching a product in monitors_page")
    public void sergey_is_searching_a_product_in_monitors_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
        actor.attemptsTo(NavigateTo.theMonitorsPage());
    }

    @When("{actor} add to first item {string} in cart")
    public void he_add_to_first_item_in_cart(Actor actor, String item) {
        actor.attemptsTo(AddToCart.theProduct(item));
        itemProduct = item;
    }

    @Then("{actor} see this item in cart")
    public void he_see_this_item_in_cart(Actor actor) {
        actor.attemptsTo(NavigateTo.theCartPage());
        actor.attemptsTo(
                Ensure.that(TheCartPage.theProductText()).containsIgnoringCase(itemProduct));
    }

    @Given("{actor} have products in the shopping cart")
    public void sergey_have_products_in_the_shopping_cart(Actor actor) {
        itemProduct = "Samsung galaxy s6";
        actor.wasAbleTo(NavigateTo.theHomePage());
        actor.attemptsTo(NavigateTo.thePhonesPage(),
                AddToCart.theProduct(itemProduct),
                NavigateTo.theCartPage());
    }

    @When("{actor} remove a product in cart")
    public void he_remove_a_product_in_cart(Actor actor) {
        actor.attemptsTo(RemoveToCart.theFirstProduct());
    }

    @Then("{actor} should see that product that removed")
    public void he_shoud_that_product_that_removed(Actor actor) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(TheCartPage.theProduct()).isFalse());
    }

    @When("{actor} confirm products in the shopping cart")
    public void he_confirm_products_in_the_shopping_cart(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("{actor} is notified that he has made the purchase")
    public void he_is_notified_that_he_has_made_the_purchase(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
