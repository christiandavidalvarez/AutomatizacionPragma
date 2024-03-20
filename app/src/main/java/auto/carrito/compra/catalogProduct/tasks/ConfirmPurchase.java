package auto.carrito.compra.catalogProduct.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static auto.carrito.compra.enums.ShopingDataEnum.*;

import java.util.*;

import auto.carrito.compra.ui.FillPurchase;

public class ConfirmPurchase {

    public static Performable theProducts(Map<String, String> purchaseDate){
        return Task.where("{0} confirm purchase",
            Click.on(FillPurchase.BUTTON_PLACE_ORDER),
            Enter.theValue(purchaseDate.get(NAME.name())).into(FillPurchase.INPUT_NAME),
            Enter.theValue(purchaseDate.get(COUNTRY.name())).into(FillPurchase.INPUT_COUNTRY),
            Enter.theValue(purchaseDate.get(CITY.name())).into(FillPurchase.INPUT_CITY),
            Enter.theValue(purchaseDate.get(CREDIT_CARD.name())).into(FillPurchase.INPUT_CREDIT_CARD),
            Enter.theValue(purchaseDate.get(MONTH.name())).into(FillPurchase.INPUT_MONTH),
            Enter.theValue(purchaseDate.get(YEAR.name())).into(FillPurchase.INPUT_YEAR),
            Scroll.to(FillPurchase.BUTTON_CONFIRM_PURCHASE).andAlignToBottom(),
            Click.on(FillPurchase.BUTTON_CONFIRM_PURCHASE)
            );

    }
    
}
