package co.com.demoblaze.tests.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprarProductosUInterface {

    public static final Target CATEGORIA_LAPTOPS = Target.the("clic en categoria laptops").locatedBy("(//*[@class= 'list-group-item'])[3]");
    public static final Target CATEGORIA_MONITORS = Target.the("clic en categria monitors").locatedBy("(//*[@class= 'list-group-item'])[4]");


    public static final Target PRODUCTO_SONY_VAIO_I7 = Target.the("clic en producto sony vaio 17").locatedBy("(//*[@class= 'hrefch'])[2]");
    public static final Target PRODUCTO_APPLE_MONITOR = Target.the("clic en producto apple monitor").locatedBy("(//*[@class= 'hrefch'])[1]");
    public static final Target BTN_CART = Target.the("clic en boton cart").locatedBy("(//*[@class= 'nav-link'])[4]");
    public static final Target PLACE_ORDER = Target.the("clic en Place order").locatedBy("//*[@class= 'btn btn-success']");
    public static final Target BTN_PURCHASE = Target.the("clic en boton purchase").locatedBy("(//*[@class= 'btn btn-primary'])[3]");

    public static final Target BTN_ADD_CAR = Target.the("clic en boton agregar al carro").locatedBy("//*[@class= 'btn btn-success btn-lg']");
    public static final Target BTN_HOME = Target.the("clic en boton home").locatedBy("//a[@class='nav-link'][contains(.,'Home (current)')]");


    public static final Target TXT_NAME = Target.the("ingresar nombre").locatedBy("(//*[@class= 'form-control'])[6]");
    public static final Target TXT_COUNTRY = Target.the("ingresar pais").locatedBy("(//*[@class= 'form-control'])[7]");
    public static final Target TXT_CITY = Target.the("ingresar ciudad").locatedBy("(//*[@class= 'form-control'])[8]");
    public static final Target TXT_CREDIT_CARD = Target.the("ingresar tarjeta de credito").locatedBy("(//*[@class= 'form-control'])[9]");
    public static final Target TXT_MONTH = Target.the("ingresar mes").locatedBy("(//*[@class= 'form-control'])[10]");
    public static final Target TXT_YEAR = Target.the("ingresar año").locatedBy("(//*[@class= 'form-control'])[11]");


    public static final Target COMPRA_EXITOSA = Target.the("confirmacion de compra").locatedBy("//*[text()= 'Thank you for your purchase!']");



}
