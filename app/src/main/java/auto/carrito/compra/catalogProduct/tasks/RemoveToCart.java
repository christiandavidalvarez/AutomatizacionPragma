package auto.carrito.compra.catalogProduct.tasks;

import auto.carrito.compra.ui.ShoppingCart;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RemoveToCart {

    public static Performable theFirstProduct(){
        return Task.where("remove first product",
            Click.on(ShoppingCart.REMOVE_FIRST_PRODUCT));
    }
    
}
