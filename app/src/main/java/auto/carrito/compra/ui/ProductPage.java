package auto.carrito.compra.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    
    public static final Target ADD_TO_CART= Target.the("{0} add to cart").locatedBy("#tbodyid > div.row > div > a") ;
}
