package auto.carrito.compra.ui;


import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {

    public static final Target REMOVE_FIRST_PRODUCT= Target.the("{0} remove first product").locatedBy("//*[@id='tbodyid']/tr/td[4]/a");

    public static final Target FIRST_PRODUCT= Target.the("{0} first product").locatedBy("#tbodyid > tr > td:nth-child(2)");
    
}
