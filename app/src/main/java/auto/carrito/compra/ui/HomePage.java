package auto.carrito.compra.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target PHONES_BUTTON= Target.the("{0} select phone button").located(By.xpath("//*[@id='itemc' and text()='Phones']")); 
    
    public static final Target LATOPS_BUTTON= Target.the("{0} select phone button").located(By.xpath("//*[@id='itemc' and text()='Laptops']")); 

    public static final Target MONITORS_BUTTON= Target.the("{0} select phone button").located(By.xpath("//*[@id='itemc' and text()='Monitors']")); 

    public static final Target ITEM_PRODUCT= Target.the("{0} product item").locatedBy("//h4//a[text()='{0}']");

	public static final Target CART_LINK = Target.the("{0} select to cart page").located(By.id("cartur"));

}
