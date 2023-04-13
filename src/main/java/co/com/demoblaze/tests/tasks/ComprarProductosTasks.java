package co.com.demoblaze.tests.tasks;

import co.com.demoblaze.tests.models.ComprarProductos;
import co.com.demoblaze.tests.models.builder.ComprarProductosBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.tests.userinterfaces.ComprarProductosUInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ComprarProductosTasks implements Task {


    private ComprarProductos comprarProductos;


    public ComprarProductosTasks(ComprarProductos comprarProductos){this.comprarProductos = comprarProductos;}


    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        WaitUntil.the(CATEGORIA_LAPTOPS,isPresent()),
        Click.on(CATEGORIA_LAPTOPS),
        Click.on(PRODUCTO_SONY_VAIO_I7),
        Click.on(BTN_ADD_CAR),
        WaitUntil.the(BTN_HOME,isPresent()),
        Click.on(BTN_HOME),
        Click.on(CATEGORIA_MONITORS),
        Click.on(PRODUCTO_APPLE_MONITOR),
        Click.on(BTN_ADD_CAR),
        Click.on(BTN_CART),
        Click.on(PLACE_ORDER),
        Enter.theValue(ComprarProductos.getName()).into(TXT_NAME),
        Enter.theValue(ComprarProductos.getCountry()).into(TXT_COUNTRY),
        Enter.theValue(ComprarProductos.getCity()).into(TXT_CITY),
        Enter.theValue(ComprarProductos.getCreditCard()).into(TXT_CREDIT_CARD),
        Enter.theValue(ComprarProductos.getMonth()).into(TXT_MONTH),
        Enter.theValue(ComprarProductos.getYear()).into(TXT_YEAR),
        Click.on(BTN_PURCHASE)



);

    }

    public static Performable endemoblaze(ComprarProductosBuilder datosRegistroBuilder) {
        return instrumented(ComprarProductosTasks.class, datosRegistroBuilder.builder());
    }

}
