package auto.carrito.compra.catalogProduct.questions;

import auto.carrito.compra.ui.ShoppingCart;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class TheCartPage {

    public static Question<String> theProductText(){
        return Text.of(ShoppingCart.FIRST_PRODUCT);
    }

    public static Question<Boolean> theProduct(){
        return Visibility.of(ShoppingCart.FIRST_PRODUCT);
    }
    
}
