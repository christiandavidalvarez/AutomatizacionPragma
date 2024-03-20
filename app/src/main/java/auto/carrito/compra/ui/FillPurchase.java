package auto.carrito.compra.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FillPurchase {
    
    public static final Target BUTTON_PLACE_ORDER= Target.the("button place order").locatedBy("#page-wrapper button");
    public static final Target INPUT_NAME= Target.the("{0} input name").locatedBy("#name");
    public static final Target INPUT_COUNTRY= Target.the("{0} input country").locatedBy("#country");
    public static final Target INPUT_CITY= Target.the("{0} input city").locatedBy("#city");
    public static final Target INPUT_CREDIT_CARD= Target.the("{0} input credit card").locatedBy("#card");
    public static final Target INPUT_MONTH= Target.the("{0} input month").locatedBy("#month");
    public static final Target INPUT_YEAR= Target.the("{0} input year").locatedBy("#year");
    public static final Target BUTTON_CONFIRM_PURCHASE= Target.the("{0} button confirm purchase").locatedBy("#orderModal button.btn.btn-primary");




    
}
